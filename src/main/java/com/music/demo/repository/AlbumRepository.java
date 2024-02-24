package com.music.demo.repository;

import com.music.demo.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Integer> {
    public List<Album> findByalbumid(Integer id);
    public List<Album> findAll();
}
