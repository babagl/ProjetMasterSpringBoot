package com.supinfo.projetmasterspringboot.Controller;

import com.supinfo.projetmasterspringboot.model.Album;
import com.supinfo.projetmasterspringboot.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private AlbumService service;

    public HomeController(AlbumService service) {
        this.service = service;
    }

    @GetMapping("")
    public String showHomePage(Model model) {
        System.out.println("show main controller");
        List<Album> albumList = service.getAll();
        model.addAttribute("albumsList",albumList);
        return "index";
    }
}
