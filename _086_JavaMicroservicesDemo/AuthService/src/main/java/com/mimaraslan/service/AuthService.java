package com.mimaraslan.service;


import com.mimaraslan.dto.request.DoLoginRequestDto;
import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.dto.response.DoLoginResponseDto;
import com.mimaraslan.exception.AuthServiceException;
import com.mimaraslan.exception.ErrorType;
import com.mimaraslan.mapper.IAuthMapper;
import com.mimaraslan.repository.IAuthRepository;
import com.mimaraslan.repository.entity.Auth;
import com.mimaraslan.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthService extends ServiceManager <Auth, Long> {

    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public String doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        if(auth.isEmpty())
            throw new AuthServiceException(ErrorType.LOGIN_USERNAME_OR_PASSWORD_NOT_EXISTS);

        return auth.get().getId().toString();
    }

    public Auth doRegister(DoRegisterRequestDto dto) {

        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);
        save(auth);
        return auth;
    }


    public List<Auth> findAll() {
        return repository.findAll();
    }

}
