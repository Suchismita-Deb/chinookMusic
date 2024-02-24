package com.music.demo.services;

import com.music.demo.model.MediaType;
import com.music.demo.repository.MediaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaTypeService {
    @Autowired
    private MediaTypeRepository mediaTypeRepository;


    public List<MediaType> getAllMediaType() {
        return mediaTypeRepository.findAll();
    }

    public List<MediaType> getMediaTypeById(Integer id) {
        return mediaTypeRepository.findBymediatypeid(id);
    }
}
