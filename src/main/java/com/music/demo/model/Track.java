package com.music.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "track")
public class Track {
    @Id
    private Integer trackid;
    private String name;
    private Integer albumid;
    private Integer mediatypeid;
    private Integer genreid;
    private String composer;
    private Integer milliseconds;
    private Integer bytes;
    private Integer unitprice;
}
