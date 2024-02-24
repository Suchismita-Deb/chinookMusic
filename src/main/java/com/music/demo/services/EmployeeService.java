package com.music.demo.services;

import com.music.demo.model.Employee;
import com.music.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllemployee() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findByemployeeid(id);
    }
}
