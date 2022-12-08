package com.supinfo.projetmasterspringboot.Controller;

import com.supinfo.projetmasterspringboot.model.Artiste;
import com.supinfo.projetmasterspringboot.model.Morceau;
import com.supinfo.projetmasterspringboot.service.ArtisteService;
import com.supinfo.projetmasterspringboot.service.MorceauService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class ArtisteController {
    private ArtisteService artisteService;
    private MorceauService morceauService;

    public ArtisteController(ArtisteService artisteService, MorceauService morceauService) {
        this.artisteService = artisteService;
        this.morceauService = morceauService;
    }

    @GetMapping("/artiste/list")
    public String saveArtiste(Model model){
        List<Artiste> artistes = artisteService.getArtistes();
        System.out.println(artistes);
        model.addAttribute("artiste", artistes);
        System.out.println("Show list Artiste");
        return "Artiste/ListArtistes";
    }

    @GetMapping("artiste/new")
    public String newArtiste(Model model){
        List<Morceau> morceaus = morceauService.morceauList();
        model.addAttribute("artiste", new Artiste());
        model.addAttribute("morceau" , morceaus);

        return "Artiste/Artisteform";
    }

    @PostMapping("artiste/saved")
    public String saveArtiste(@ModelAttribute Artiste artiste){
        artisteService.saveArtiste(artiste);
        return "redirect:/artiste/list";
    }

    @GetMapping()
    public String showDetailsArtiste(){
        return "Artiste/details";
    }
}
