package com.music.demo.repository;

import com.music.demo.model.InvoiceLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceLineRepository extends JpaRepository<InvoiceLine,Integer> {
    public List<InvoiceLine> findAll();
    public List<InvoiceLine> findByinvoiceid(Integer id);
}
