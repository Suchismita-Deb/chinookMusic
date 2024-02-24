package com.music.demo.services;

import com.music.demo.model.Genre;
import com.music.demo.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServices {
    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public List<Genre> getGenresById(Integer id) {
        return genreRepository.findBygenreid(id);
    }
}
