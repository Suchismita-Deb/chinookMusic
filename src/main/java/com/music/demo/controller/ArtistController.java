package com.music.demo.controller;

import com.music.demo.model.Artist;
import com.music.demo.services.ArtistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistController {
    @Autowired
    private ArtistServices artistServices;

    @GetMapping("/artists")
    public List<Artist> getAllArtists(){
        return artistServices.getAllArtists();
    }

    @GetMapping("/artists/{id}")
    public List<Artist> getArtistsById(@PathVariable Integer id){
        return artistServices.getArtistById(id);
    }
}
