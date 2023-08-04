package com.mimaraslan.controller.web;


import com.mimaraslan.model_entity.Employee;
import com.mimaraslan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller   // Web sayfaları ile Java konuşacak.
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //   http://localhost:8080
    //   http://localhost:8080/
    //   http://localhost:8080/list
    @RequestMapping({"/","/list"}) //@GetMapping
    public String getAllEmployees(Model model){

        List<Employee> listEmployees = employeeService.getAllEmployees();

        model.addAttribute("listEmployees", listEmployees);

       /* for ( Employee employee: listEmployees ) {
            System.out.println(employee);
        }*/

        return "list-employees";
    }




    //   http://localhost:8080/add
    @RequestMapping({"/edit", "/edit/{id}"}) //@GetMapping
    public String getEditEmployee(Model model){
        return "add-edit-employees";
    }


    //   http://localhost:8080/createEmployee
    //@PostMapping(value = "/createEmployee")
    @RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
    public String createOrUpdateEmployee(Employee employee){

        employeeService.createOrUpdateEmployee(employee);

        return "redirect:/";
    }



}
