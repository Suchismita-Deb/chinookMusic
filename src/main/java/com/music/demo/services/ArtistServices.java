package com.music.demo.services;

import com.music.demo.model.Artist;
import com.music.demo.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServices {
    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public List<Artist> getArtistById(Integer id) {
        return artistRepository.findByartistid(id);
    }
}
