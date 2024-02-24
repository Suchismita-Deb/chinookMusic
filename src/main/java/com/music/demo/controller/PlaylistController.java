package com.music.demo.controller;

import com.music.demo.model.Playlist;
import com.music.demo.services.PlaylistServices;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Controller", description = "Playlist Details.")
public class PlaylistController {
    @Autowired
    private PlaylistServices playlistServices;

    @GetMapping("/playlists")
    public List<Playlist> getAllPlaylist(){
        return playlistServices.getAllPlaylist();
    }

    @GetMapping("/playlists/{id}")
    public List<Playlist> getPlaylistsById(@PathVariable Integer id){
        return playlistServices.getSpecificPlaylist(id);
        // returning null.
    }
}
