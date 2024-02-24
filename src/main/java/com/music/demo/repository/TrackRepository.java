package com.music.demo.repository;

import com.music.demo.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {
    public List<Track> findALl();
    public List<Track> findBytrackid(Integer id);
}
