package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello docker";
    }

    @GetMapping("/metod2")
    public String metod2() {
        return "Metod 2";
    }

    @GetMapping("/metod3")
    public String metod3() {
        return "Metod 3";
    }
}
