package com.mimaraslan.controller;

import com.mimaraslan.constant.EndPoints;
import com.mimaraslan.dto.request.RegisterRequestDto;
import com.mimaraslan.repository.entity.Auth;
import com.mimaraslan.service.AuthService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.mimaraslan.constant.EndPoints.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(AUTH)
public class AuthController {

    private final AuthService authService;

    @PostMapping(LOGIN)
    public ResponseEntity<String> doLogin (@RequestBody RegisterRequestDto dto) {
        return ResponseEntity.ok(authService.doLogin(dto));
    }

    @PostMapping(REGISTER)
    public ResponseEntity<Auth> register(@RequestBody RegisterRequestDto dto){
      /*
        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());
        auth.setPassword(dto.getPassword());
        authService.save(auth);
        */

        Auth auth = authService.save(
                Auth.builder()
                        .username(dto.getUsername())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                        .build()
        );

        return ResponseEntity.ok(auth);
    }


}
