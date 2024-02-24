package com.music.demo.services;

import com.music.demo.model.Track;
import com.music.demo.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServices {

    @Autowired
    private TrackRepository trackRepository;

    public List<Track> getAllTrack() {
        return trackRepository.findALl();
    }

    public List<Track> getTrackById(Integer id) {
        return trackRepository.findBytrackid(id);
    }
}
