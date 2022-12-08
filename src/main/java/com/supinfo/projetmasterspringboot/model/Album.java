package com.supinfo.projetmasterspringboot.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAlbum;
    @Column(nullable = false,unique = true, length = 50)
    private String titreAlbum;
    private String genre;
    @Column(length = 45, nullable = true)
    private String logo;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateDeSortie;
    @OneToMany
    @JoinColumn(name = "id_album")
    List<Morceau> morceauList = new ArrayList<>() ;
    public Long getIdAlbum() {
        return IdAlbum;
    }

    public void setIdAlbum(Long idAlbum) {
        IdAlbum = idAlbum;
    }

    public String getTitreAlbum() {
        return titreAlbum;
    }

    public void setTitreAlbum(String titreAlbum) {
        this.titreAlbum = titreAlbum;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(LocalDate dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public List<Morceau> getMorceauList() {
        return morceauList;
    }

    public void setMorceauList(List<Morceau> morceauList) {
        this.morceauList = morceauList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "IdAlbum=" + IdAlbum +
                ", titreAlbum='" + titreAlbum + '\'' +
                ", genre='" + genre + '\'' +
                ", logo='" + logo + '\'' +
                ", dateDeSortie=" + dateDeSortie +
                ", morceauList=" + morceauList +
                '}';
    }
}
