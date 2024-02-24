package com.music.demo.controller;

import com.music.demo.model.Track;
import com.music.demo.services.TrackServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackController {
    @Autowired
    private TrackServices trackServices;

    @GetMapping("/tracks")
    public List<Track> getAlTrack(){
        return trackServices.getAllTrack();
    }

    @GetMapping("/tracks/{id}")
    public List<Track> getTrackbyId(@PathVariable Integer id){
        return trackServices.getTrackById(id);
    }
}
