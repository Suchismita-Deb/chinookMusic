package com.music.demo.services;

import com.music.demo.model.Invoice;
import com.music.demo.model.InvoiceLine;
import com.music.demo.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServices {
    @Autowired
    private InvoiceRepository invoiceRepository;

//    public List<Invoice> getAllInvoices(){
//        return invoiceRepository.findALl();
//    }

    public List<Invoice> getInvoiceByInvoiceId(Integer invoiceid) {
        return invoiceRepository.findByinvoiceid(invoiceid);
    }
}
