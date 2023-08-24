package com.mimaraslan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fallback")
public class FallbackController {

    // http://localhost:9090/fallback/auth
    @GetMapping("/auth")
    public ResponseEntity<String> fallbackAuth() {
        return ResponseEntity.ok("Auth Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }

    // http://localhost:9091/fallback/product
    @GetMapping("/product")
    public  ResponseEntity<String>  fallbackProduct() {
        return ResponseEntity.ok("Product Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }

    // http://localhost:9092/fallback/sale
    @GetMapping("/sale")
    public  ResponseEntity<String>  fallbackSale() {
        return ResponseEntity.ok("Sale Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }


    // http://localhost:9093/fallback/user
    @GetMapping("/user")
    public  ResponseEntity<String>  fallbackUser() {
        return ResponseEntity.ok("User Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }
}
