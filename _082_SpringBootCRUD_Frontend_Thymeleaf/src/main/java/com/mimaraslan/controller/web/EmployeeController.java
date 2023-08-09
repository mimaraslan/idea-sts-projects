package com.mimaraslan.controller.web;


import com.mimaraslan.exception.RecordNotFoundException;
import com.mimaraslan.model_entity.Employee;
import com.mimaraslan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

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


    // http://localhost:8080/add
    // http://localhost:8080/edit/1
    @RequestMapping(path = {"/edit", "/edit/{id}"})
    public String editEmployeeById(Model model, @PathVariable("id") Optional<Long> id) throws  RecordNotFoundException {
        if (id.isPresent()) {
            Employee entity = employeeService.getEmployeeById(id.get());
            model.addAttribute("employee", entity);
        } else {
            model.addAttribute("employee", new Employee());
        }
        return "add-edit-employee";
    }

    //   http://localhost:8080/createEmployee
    @RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
    //  @PostMapping("/createEmployee")
    public String createOrUpdateEmployee(Employee employee) {
        employeeService.createOrUpdateEmployee(employee);
        return "redirect:/";
    }


    @RequestMapping(path = "/delete/{id}")
    public String deleteEmployeeById(Model model, @PathVariable("id") Long id)  throws  RecordNotFoundException {
        employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }


}
