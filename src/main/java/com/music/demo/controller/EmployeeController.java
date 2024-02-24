package com.music.demo.controller;

import com.music.demo.model.Employee;
import com.music.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllemployee();
    }

    @GetMapping("/employees/{id}")
    public List<Employee> getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }
}
