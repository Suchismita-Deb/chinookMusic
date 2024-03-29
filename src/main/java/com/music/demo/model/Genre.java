package com.music.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "genre")
public class Genre {
    @Id
    private Integer genreid;
    private String name;
}
