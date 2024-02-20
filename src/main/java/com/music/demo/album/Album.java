package com.music.demo.album;

import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "album")
public class Album {
    @Id
    private Integer albumid;
    private String artist;
    private Integer artistid;
}
