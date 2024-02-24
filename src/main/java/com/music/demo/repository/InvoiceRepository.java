package com.music.demo.repository;

import com.music.demo.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
//    public List<Invoice> findALl();
    public List<Invoice> findByinvoiceid(Integer invoiceid);
}
