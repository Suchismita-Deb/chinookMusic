package com.music.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "playlist")
public class Playlist {

    @Id
    private Integer playlistid;
    private String name;
}
