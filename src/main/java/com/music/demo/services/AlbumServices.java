package com.music.demo.services;

import com.music.demo.model.Album;
import com.music.demo.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServices {
    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getArtistByArtistId(Integer id) {
        return albumRepository.findByalbumid(id);
    }
}
