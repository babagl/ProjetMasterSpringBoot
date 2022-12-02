package com.supinfo.projetmasterspringboot.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "artiste")
public class Artiste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdArtiste;
    private String nom;
    private String prenom;
    private String genre;//sexe
    private LocalDate dateDeNaissance;
    private String pays;

    public Artiste() {
    }

    public Artiste(Long idArtiste, String nom, String prenom, String genre, LocalDate dateDeNaissance, String pays) {
        IdArtiste = idArtiste;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.dateDeNaissance = dateDeNaissance;
        this.pays = pays;

    }

    public Long getIdArtiste() {
        return IdArtiste;
    }

    public void setIdArtiste(Long idArtiste) {
        IdArtiste = idArtiste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }


}
