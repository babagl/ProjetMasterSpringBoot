package com.supinfo.projetmasterspringboot.service;

import com.supinfo.projetmasterspringboot.model.Artiste;
import com.supinfo.projetmasterspringboot.repository.ArtisteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtisteService {
    private ArtisteRepository artisteRepository;

    public ArtisteService(ArtisteRepository artisteRepository) {
        this.artisteRepository = artisteRepository;
    }
    public List<Artiste> artistes(){
        return artisteRepository.findAll();
    }

    public Artiste saveArtiste(Artiste artiste){
        return artisteRepository.save(artiste);
    }
}
