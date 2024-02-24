package com.music.demo.controller;

import com.music.demo.model.InvoiceLine;
import com.music.demo.services.InvoiceLineServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvoiceLineController {
    @Autowired
    private InvoiceLineServices invoiceLineServices;

    @GetMapping("/invoiceLines")
    public List<InvoiceLine> getAllInvoiceLine(){
        return invoiceLineServices.getAllInvoiceLine();
    }

    @GetMapping("/invoiceLines/{id}")
    public List<InvoiceLine> getInvoiceLineById(@PathVariable Integer id){
        return invoiceLineServices.getInvoiceLineById(id);
    }
}
