package com.mimaraslan.service;


import com.mimaraslan.dto.request.DoLoginRequestDto;
import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.exception.AuthServiceException;
import com.mimaraslan.exception.ErrorType;
import com.mimaraslan.manager.IUserProfileManager;
import com.mimaraslan.mapper.IAuthMapper;
import com.mimaraslan.rabbitmq.model.SaveAuthModel;
import com.mimaraslan.rabbitmq.producer.CreateUserProducer;
import com.mimaraslan.repository.IAuthRepository;
import com.mimaraslan.repository.entity.Auth;
import com.mimaraslan.utility.JwtTokenManager;
import com.mimaraslan.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthService extends ServiceManager <Auth, Long> {

    private final IAuthRepository repository;

    private final JwtTokenManager jwtTokenManager;

    private final IUserProfileManager userProfileManager;


    private  final CreateUserProducer createUserProducer;


    public AuthService(IAuthRepository repository,
                       JwtTokenManager jwtTokenManager,
                       IUserProfileManager userProfileManager,
                       CreateUserProducer createUserProducer) {
        super(repository);
        this.repository = repository;
        this.jwtTokenManager = jwtTokenManager;
        this.userProfileManager = userProfileManager;
        this.createUserProducer = createUserProducer;
    }

    public String doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        if(auth.isEmpty())
            throw new AuthServiceException(ErrorType.LOGIN_USERNAME_OR_PASSWORD_NOT_EXISTS);

       // return    auth.get().getId().toString();
        return  jwtTokenManager.createToken(auth.get().getId()).get();
    }

    public Auth doRegister(DoRegisterRequestDto dto) {

        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);

        auth.setCreateAt(System.currentTimeMillis());
        auth.setState(true);

        save(auth);

        // DİĞER SERVİCE GİDİLİYOR
        //  http://localhost:9093/user/save
/*
        userProfileManager.save(UserProfileSaveRequestDto.builder()
                        .authid(auth.getId())
                        .username(auth.getUsername())
                        .email(auth.getEmail())
                .build() );
*/

//        userProfileManager.save(IAuthMapper.INSTANCE.fromAuth(auth));


        // Mesajı RabbitMQ'ya gönderdik.
        createUserProducer.convertAndSend(SaveAuthModel.builder()
                .authid(auth.getId())
                .username(auth.getUsername())
                .email(auth.getEmail())
                .build());

        return auth;
    }

     // Tokensiz
/*
    public List<Auth> findAll() {
        return repository.findAll();
    }
    */


    public List<Auth> findAll(String token) {

        Optional<Long> id = null;

        try {
            id = jwtTokenManager.getIdFromToken(token);
            System.out.println("ID: "+ id);
        }catch (Exception e){
            throw new AuthServiceException(ErrorType.INVALID_TOKEN);
        }


        if (findById(id.get()).isEmpty()){
            throw new AuthServiceException(ErrorType.INVALID_TOKEN); // FIXME
        }


        return repository.findAll();
    }

}
