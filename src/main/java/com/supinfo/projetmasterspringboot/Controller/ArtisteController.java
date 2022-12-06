package com.supinfo.projetmasterspringboot.Controller;

import com.supinfo.projetmasterspringboot.model.Artiste;
import com.supinfo.projetmasterspringboot.service.ArtisteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class ArtisteController {
    private ArtisteService artisteService;

    public ArtisteController(ArtisteService artisteService) {
        this.artisteService = artisteService;
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
        model.addAttribute("artiste", new Artiste());
        return "Artiste/Artisteform";
    }

    @PostMapping("artiste/saved")
    public String saveArtiste(@ModelAttribute Artiste artiste){
        artisteService.saveArtiste(artiste);
        return "redirect:/artiste/list";
    }
}
