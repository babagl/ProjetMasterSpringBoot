package com.supinfo.projetmasterspringboot.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAlbum;
    @Column(nullable = false,unique = true, length = 50)
    private String titreAlbum;
    private String genre;
    private String logo;
    private LocalDate dateDeSortie;

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

    @Override
    public String toString() {
        return "Album{" +
                "IdAlbum=" + IdAlbum +
                ", titreAlbum='" + titreAlbum + '\'' +
                ", genre='" + genre + '\'' +
                ", logo='" + logo + '\'' +
                ", dateDeSortie=" + dateDeSortie +
                '}';
    }
}
