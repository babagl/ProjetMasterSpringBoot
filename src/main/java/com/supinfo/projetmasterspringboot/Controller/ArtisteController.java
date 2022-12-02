package com.supinfo.projetmasterspringboot.Controller;

import com.supinfo.projetmasterspringboot.service.ArtisteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ArtisteController {
    private ArtisteService artisteService;

    @GetMapping("/artiste/list")
    public String saveArtiste(Model model){
        System.out.println("Show list Artiste");
        return "Artiste/ListArtistes";
    }
}
