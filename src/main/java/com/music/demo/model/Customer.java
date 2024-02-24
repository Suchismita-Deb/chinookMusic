package com.music.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private Integer customerid;
    private String firstname;
    private String lastname;
    private String company;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalcode;
    private String phone;
    private String fax;
    private String email;
    private Integer supportrepid;
}
