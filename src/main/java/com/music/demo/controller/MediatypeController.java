package com.music.demo.controller;

import com.music.demo.model.MediaType;
import com.music.demo.services.MediaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MediatypeController {
    @Autowired
    private MediaTypeService mediaTypeService;

    @GetMapping("/mediaTypes")
    public List<MediaType> getAllMediaType(){
        return mediaTypeService.getAllMediaType();
    }

    @GetMapping("/mediaTypes/{id}")
    public List<MediaType> getMediaTypeById(@PathVariable Integer id){
        return mediaTypeService.getMediaTypeById(id);
    }
}
