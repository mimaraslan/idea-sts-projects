package com.mimaraslan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:8080/api/v1
// http://localhost:8080/surum1
@RestController
@RequestMapping({"/api/v1", "/surum1"})
public class HelloController {

    //  http://localhost:8080/api/v1/hello
    //  http://localhost:8080/surum1/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello Docker";
    }


}
