package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    // http://localhost:9100
    @GetMapping
    public String hello() {
        return "Elastic Service";
    }


    // http://localhost:9100/info
    @GetMapping("/info")
    public String info() {
        return "INFO: Elastic Service";
    }

}
