package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:8080
@RestController
@RequestMapping()
public class HelloWorld {

    @GetMapping()
    public String getHello(){
        return "Selam";
    }
}
