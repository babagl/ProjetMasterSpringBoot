package com.supinfo.projetmasterspringboot.Controller;

import com.supinfo.projetmasterspringboot.model.Morceau;
import com.supinfo.projetmasterspringboot.service.MorceauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MorceauController {
    @Autowired
    private MorceauService service;

    @GetMapping("/morceau/list")
    public String showMorceau(Model model){
        model.addAttribute("m", service.morceauList());
        return "morceau/Morceau";
    }

    @GetMapping("/morceau/new")
    public String newMorceau(Model model){
        model.addAttribute("mo", new Morceau());
        return "morceau/morceauform";
    }

    @PostMapping("/morceau/saved")
    public String saveMorceau(@ModelAttribute Morceau morceau){
        service.saveMorceau(morceau);
        return "redirect:/morceau/list";
    }
}
