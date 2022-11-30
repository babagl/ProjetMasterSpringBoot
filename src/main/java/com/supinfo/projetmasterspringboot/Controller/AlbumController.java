package com.supinfo.projetmasterspringboot.Controller;

import com.supinfo.projetmasterspringboot.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @GetMapping("/album/new")
    public String newAlbum(Model model){
        model.addAttribute("album",new Album());
        return "album/AlbumForm";
    }

}
