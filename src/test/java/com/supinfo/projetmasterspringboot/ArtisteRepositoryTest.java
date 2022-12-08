package com.supinfo.projetmasterspringboot;

import com.supinfo.projetmasterspringboot.model.Album;
import com.supinfo.projetmasterspringboot.model.Artiste;
import com.supinfo.projetmasterspringboot.model.Morceau;
import com.supinfo.projetmasterspringboot.repository.AlbumRepository;
import com.supinfo.projetmasterspringboot.repository.ArtisteRepository;

import com.supinfo.projetmasterspringboot.repository.MorceauRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDate;
import java.util.Optional;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ArtisteRepositoryTest {
    @Autowired
    ArtisteRepository artisteRepository;

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    MorceauRepository morceauRepository;

    @Test
    public void testAddNewArtiste(){
        Artiste artiste = new Artiste();
        artiste.setNom("Dione");
        artiste.setPrenom("Mbaha");
        artiste.setPays("Senegal");
        artiste.setDateDeNaissance(LocalDate.now());
        artiste.setGenre("masculin");
        Artiste artisteSaved = artisteRepository.save(artiste);

        Assertions.assertThat(artisteSaved).isNotNull();
        Assertions.assertThat(artisteSaved.getIdArtiste()).isGreaterThan(0);

        Album album = new Album();
        album.setTitreAlbum("Bercy");
        album.setGenre("Rap");
        album.setLogo("logos");
        album.setDateDeSortie(LocalDate.now());
        Album albumsaved = albumRepository.save(album);
        Assertions.assertThat(albumsaved).isNotNull();
        Assertions.assertThat(albumsaved.getIdAlbum()).isGreaterThan(0);

        Morceau morceau = new Morceau();
        morceau.setTitreMorceau("Mbaxalou Saloum");
        morceau.setDuree(3L);
        Morceau morceauSaved = morceauRepository.save(morceau);
        Assertions.assertThat(morceauSaved).isNotNull();
        Assertions.assertThat(morceauSaved.getIdMorceau()).isGreaterThan(0);

    }

    @Test
    public void testListAll(){
        Iterable<Album> albums = albumRepository.findAll();
        Assertions.assertThat(albums).hasSizeGreaterThan(0);

        for (Album album : albums) {
            System.out.println(album);
        };
    }

    @Test
    public void testUpdate(){
        Long idAlbum= 2L;
        Optional<Album> optionalAlbum = albumRepository.findById(idAlbum);
        Album album = optionalAlbum.get();
        album.setTitreAlbum("Bercy");
        albumRepository.save(album);

        Album updateAlbum = albumRepository.findById(idAlbum).get();
        Assertions.assertThat(updateAlbum.getTitreAlbum()).isEqualTo("Bercy");
    }

    @Test
    public void testGet(){
        Long albumId = 2L;
        Optional<Album> albumOptional = albumRepository.findById(albumId);
        Assertions.assertThat(albumOptional).isPresent();
        System.out.println(albumOptional.get());
    }

    @Test
    public void testDelete(){
        Long albumId = 2L;
        albumRepository.deleteById(albumId);

        Optional<Album> optionalAlbum= albumRepository.findById(albumId);
        Assertions.assertThat(optionalAlbum).isNotPresent();

    }
}
