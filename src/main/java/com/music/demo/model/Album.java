package com.music.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="album")
public class Album {
    @Id
    private Integer albumid;
    private String title;
    private Integer artistid;
}
