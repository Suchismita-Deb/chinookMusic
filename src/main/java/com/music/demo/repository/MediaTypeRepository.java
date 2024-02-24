package com.music.demo.repository;

import com.music.demo.model.Genre;
import com.music.demo.model.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaTypeRepository extends JpaRepository<MediaType,Integer> {
    public List<MediaType> findAll();
    public List<MediaType> findBymediatypeid(Integer id);
}
