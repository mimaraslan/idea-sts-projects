package com.mimaraslan.service;


import com.mimaraslan.model_entity.Employee;
import com.mimaraslan.repository_dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployees() {
/*
        List<Employee> listEmployees = employeeRepository.findAll();

        if(listEmployees.size()>0)
            return listEmployees;
        else
            return new ArrayList<Employee>();
        */

        return employeeRepository.findAll();


    }
}
