package com.music.demo.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServices {
    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getArtistByArtistId(Integer id) {
        return albumRepository.findByArtistId(id);
    }
}
