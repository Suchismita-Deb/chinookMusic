package com.music.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private Integer employeeid;
    private String lastname;
    private String firstname;
    private String title;
    private Integer reportsto;
    private Timestamp birthdate;
    private Timestamp hiredate;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalcode;
    private String phone;
    private String fax;
    private String email;
}
