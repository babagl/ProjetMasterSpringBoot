package com.supinfo.projetmasterspringboot.Controller;

import com.supinfo.projetmasterspringboot.model.Album;
import com.supinfo.projetmasterspringboot.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class AlbumController {

    private AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/album/new")
    public String newAlbum(Model model){
        model.addAttribute("album",new Album());
        return "album/AlbumForm";
    }

    @GetMapping("/album/list")
    public String showAlbum(){
        return "redirect:/";
    }

    @PostMapping("/album/save")
    public String saveAlbum(@ModelAttribute Album album
                            /*@RequestParam("logo") MultipartFile multipartFile*/) throws IOException {
        //String logo = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        System.out.println("Date de sortie = "+album.getDateDeSortie());
        album.setLogo("logo");
        albumService.saveAlbum(album);
        /*album.setLogo(logo);
        Album albumsaved = albumService.saveAlbum(album);
        String uploadDir = "/album-Logo/"+ albumsaved.getIdAlbum();
        Path pathUpload = Paths.get(uploadDir);*/

        /*if (!Files.exists(pathUpload)){
            Files.createDirectories(pathUpload);
        }

        try(InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = pathUpload.resolve(logo);
            Files.copy(inputStream, filePath , StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e){
            throw new IOException("ne peut pas enregistrer "+logo);
        }

*/
        return "redirect:/";
    }

}
