package com.supinfo.projetmasterspringboot.service;

import com.supinfo.projetmasterspringboot.model.Album;
import com.supinfo.projetmasterspringboot.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    AlbumRepository repository;
    public List<Album> getAll(){
        return repository.findAll();
    }
}
