package com.music.demo.repository;

import com.music.demo.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Integer> {
    public List<Artist> findAll();
    public List<Artist> findByartistid(Integer id);
}
