package com.music.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name="invoice")
public class Invoice {
    @Id
    private Integer invoiceid;
    private Integer customerid;
    private Timestamp invoicedate;
    private String billingaddress;
    private String billingcity;
    private String billingstate;
    private String billingcountry;
    private String billingpostalcode;
    private int total;
}
