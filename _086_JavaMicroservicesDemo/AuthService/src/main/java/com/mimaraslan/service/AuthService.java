package com.mimaraslan.service;


import com.mimaraslan.dto.request.RegisterRequestDto;
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

    public String doLogin(RegisterRequestDto dto) {
        return null;
    }
}
