package com.music.demo.services;

import com.music.demo.model.InvoiceLine;
import com.music.demo.repository.InvoiceLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceLineServices {
    @Autowired
    private InvoiceLineRepository invoiceLineRepository;

    public List<InvoiceLine> getAllInvoiceLine() {
        return invoiceLineRepository.findAll();
    }

    public List<InvoiceLine> getInvoiceLineById(Integer id) {
        return invoiceLineRepository.findByinvoiceid(id);
    }
}
