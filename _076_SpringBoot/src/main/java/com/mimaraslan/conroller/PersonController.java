package com.mimaraslan.conroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PersonController {


    // http://localhost:8081
    @GetMapping
    public String getHello() {
        return "Selamlar Merhaba";
    }


    // http://localhost:8081/person
    @GetMapping("person")
    public String getPersonInfo() {
        return "Merhabalar, Personel Bilgisi";
    }

}
