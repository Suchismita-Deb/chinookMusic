package com.music.demo.repository;

import com.music.demo.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist,Integer> {
    public List<Playlist> findAll();
    public List<Playlist> findByplaylistid(Integer id);
}
