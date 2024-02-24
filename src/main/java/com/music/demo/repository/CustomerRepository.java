package com.music.demo.repository;

import com.music.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    public List<Customer> findAll();

    public List<Customer> findBycustomerid(Integer customerId);
}
