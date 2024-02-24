package com.music.demo.controller;

import com.music.demo.model.Album;
import com.music.demo.services.AlbumServices;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Controller", description = "Album Details.")
public class AlbumController {
    @Autowired
    private AlbumServices albumServices;

    @GetMapping("/album")
    public List<Album> getAllAlbum(){
        return albumServices.getAllAlbum();
    }
    @GetMapping("/artistId/{id}")
    public List<Album> getArtistByAlbumId(@PathVariable Integer id){
        return albumServices.getArtistByAlbumId(id);
    }
}
