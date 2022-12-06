package com.supinfo.projetmasterspringboot.Controller;

import com.supinfo.projetmasterspringboot.model.Morceau;
import com.supinfo.projetmasterspringboot.service.MorceauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MorceauController {
    @Autowired
    private MorceauService service;

    @GetMapping("/morceau/list")
    public String showMorceau(Model model){
        model.addAttribute("m", service.morceauList());
        return "morceau/Morceau";
    }

    @GetMapping()
    public String newMorceau(Model model){
        model.addAttribute("mo", new Morceau());
        return "morceau/morceauform";
    }
}
