package com.music.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "invoiceline")
public class InvoiceLine {
    @Id
    private Integer invoicelineid;
    private Integer invoiceid;
    private Integer trackid;
    private Integer unitprice;
    private Integer quantity;
}