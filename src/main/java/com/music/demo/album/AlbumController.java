package com.music.demo.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AlbumController {
    @Autowired
    private AlbumServices albumServices;

    @GetMapping("/artistId/{id}")
    public List<Album> getArtistByArtistId(@PathVariable Integer id){
        return albumServices.getArtistByArtistId(id);
    }
}
