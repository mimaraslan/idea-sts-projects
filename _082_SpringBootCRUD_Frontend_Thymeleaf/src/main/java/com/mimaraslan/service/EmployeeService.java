package com.mimaraslan.service;


import com.mimaraslan.exception.RecordNotFoundException;
import com.mimaraslan.model_entity.Employee;
import com.mimaraslan.repository_dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {

        List<Employee> listEmployees = employeeRepository.findAll();

        if(listEmployees.size()>0)
            return listEmployees;
        else
            return new ArrayList<Employee>();

       // return employeeRepository.findAll();
    }


    public Employee getEmployeeById(Long id) throws RecordNotFoundException {

        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given ID : " + id);
            //   throw new ResourceNotFoundException("No employee record exist for given ID : " + id);
        }

     /*
        Optional<Employee> employee = Optional.ofNullable(employeeRepository.findById(id)
                .orElseThrow(   () -> new ResourceNotFoundException("Employee not found ID : " + id)    ));
        return employee.get();
      */
    }



    public Employee createOrUpdateEmployee(Employee employee) {

        // CREATE - ADD
        if(employee.getId() == null ){
            employee = employeeRepository.save(employee);
            return employee;
        }
        else {  // EDIT - UPDATE
            Optional<Employee> employeeInfo = employeeRepository.findById(employee.getId());

            if (employeeInfo.isPresent()) {
                Employee newEntity = employeeInfo.get();
                newEntity.setEmail(employee.getEmail());
                newEntity.setFirstName(employee.getFirstName());
                newEntity.setLastName(employee.getLastName());
                newEntity = employeeRepository.save(newEntity);
                return newEntity;
            } else {
                employee = employeeRepository.save(employee);
                return employee;
            }
        }
    }

    public void deleteEmployeeById(Long id) throws  RecordNotFoundException {
        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent()) {
            employeeRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }

}
