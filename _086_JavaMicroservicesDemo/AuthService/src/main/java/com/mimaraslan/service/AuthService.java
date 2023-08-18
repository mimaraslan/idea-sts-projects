package com.mimaraslan.service;


import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.mapper.IAuthMapper;
import com.mimaraslan.repository.IAuthRepository;
import com.mimaraslan.repository.entity.Auth;
import com.mimaraslan.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AuthService extends ServiceManager <Auth, Long> {

    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public String doLogin(DoRegisterRequestDto dto) {
        return null;
    }

    public Auth doRegister(DoRegisterRequestDto dto) {

        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);
        save(auth);
        return auth;
    }
}
