package com.music.demo.services;

import com.music.demo.model.Playlist;
import com.music.demo.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaylistServices {
    @Autowired
    private PlaylistRepository playlistRepository;

    public List<Playlist> getAllPlaylist() {
        List<Playlist> playlists = new ArrayList<>();
        playlistRepository.findAll().forEach(playlist -> playlists.add(playlist));
        // without the foreach it is showing the list.
        return playlistRepository.findAll();
    }

    public List<Playlist> getSpecificPlaylist(Integer id){
        return playlistRepository.findByplaylistid(id);
    }
}
