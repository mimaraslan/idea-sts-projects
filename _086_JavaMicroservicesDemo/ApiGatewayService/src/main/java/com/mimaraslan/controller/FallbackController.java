package com.mimaraslan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//   http://localhost:9090/fallback
@RestController
@RequestMapping("/fallback")
public class FallbackController {

    // http://localhost:9090/fallback/auth
    @GetMapping("/auth")
    public ResponseEntity<String> fallbackAuth() {
        return ResponseEntity.ok("Auth Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }

    // http://localhost:9090/fallback/sale
    @GetMapping("/sale")
    public  ResponseEntity<String>  fallbackSale() {
        return ResponseEntity.ok("Sale Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }


}
