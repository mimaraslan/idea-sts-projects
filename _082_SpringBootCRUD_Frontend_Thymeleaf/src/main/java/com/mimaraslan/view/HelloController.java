package com.mimaraslan.view;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//  http://localhost:8080/selam
//  http://localhost:8080/hello?firstName=GELEN_DEGER
@Controller
public class HelloController {
    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="firstName", required=false, defaultValue="World") String firstName) {
        model.addAttribute("firstName", firstName);
        return "hello";
    }
}