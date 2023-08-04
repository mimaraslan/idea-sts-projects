package com.mimaraslan.controller.web;


import com.mimaraslan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   // Web sayfaları ile Java konuşacak.
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    //   http://localhost:8080/list
    @RequestMapping({"/","/list"}) //@GetMapping
    public String getAllEmployees(){
        return "list-employees";
    }


    //   http://localhost:8080/add
    @RequestMapping("/add") //@GetMapping
    public String getAddEmployee(){
        return "add-employees";
    }


}
