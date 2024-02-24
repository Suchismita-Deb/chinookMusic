package com.music.demo.repository;

import com.music.demo.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Integer> {
    public List<Genre> findAll();
    public List<Genre> findBygenreid(Integer id);
}
