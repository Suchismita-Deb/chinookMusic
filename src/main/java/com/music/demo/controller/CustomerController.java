package com.music.demo.controller;

import com.music.demo.model.Customer;
import com.music.demo.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;


    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerServices.getAllCustomer();
    }

    @GetMapping("/customers/{customerId}")
    public List<Customer> getCustomerById(@PathVariable Integer customerId){
        return customerServices.getCustomerById(customerId);
    }
}
