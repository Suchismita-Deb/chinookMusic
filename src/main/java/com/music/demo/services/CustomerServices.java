package com.music.demo.services;

import com.music.demo.model.Customer;
import com.music.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public List<Customer> getCustomerById(Integer customerId) {
        return customerRepository.findBycustomerid(customerId);
    }
}
