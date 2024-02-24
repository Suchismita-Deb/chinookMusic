package com.music.demo.controller;

import com.music.demo.model.Genre;
import com.music.demo.services.GenreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenreController {
    @Autowired
    private GenreServices genreServices;

    @GetMapping("/genres")
    public List<Genre> getAllGenres(){
        return genreServices.getAllGenres();
    }

    @GetMapping("/genres/{id}")
    public List<Genre> getGenreById(@PathVariable Integer id){
        return genreServices.getGenresById(id);
    }
}
