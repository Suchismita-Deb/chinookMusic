package com.music.demo.controller;

import com.music.demo.model.Invoice;
import com.music.demo.services.InvoiceServices;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Controller", description = "Invoice Details.")
public class InvoiceController {
    @Autowired
    private InvoiceServices invoiceServices;

//    @GetMapping("/invoices")
//    public List<Invoice> getAllInvoice(){
//        return invoiceServices.getAllInvoices();
//    }

    @GetMapping("/invoices/{invoiceId}")
    public List<Invoice> getInvoicesById(@PathVariable Integer invoiceid){
        return invoiceServices.getInvoiceByInvoiceId(invoiceid);
    }
}
