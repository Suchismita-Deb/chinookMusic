package com.music.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "mediatype")
public class MediaType {
    @Id
    private Integer mediatypeid;
    private String name;
}
