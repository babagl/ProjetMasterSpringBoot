package com.supinfo.projetmasterspringboot.service;

import com.supinfo.projetmasterspringboot.model.Morceau;
import com.supinfo.projetmasterspringboot.repository.MorceauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MorceauService {
    @Autowired
    MorceauRepository morceauRepository;
    public List<Morceau> morceauList(){
        return morceauRepository.findAll();
    }
     public Morceau morceau(Morceau morceau){
        return morceauRepository.save(morceau);
     }

     public Morceau saveMorceau(Morceau morceau){
        return morceauRepository.save(morceau);
     }
}
