package com.supinfo.projetmasterspringboot.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "artiste")
public class Artiste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdArtiste;
    private String nom;
    private String prenom;
    private String genre;//sexe
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateDeNaissance;
    private String pays;

    @OneToMany(mappedBy = "artiste" ,cascade = CascadeType.PERSIST)
    List<Morceau> morceauList = new ArrayList<>();

    public Artiste() {
    }

    public Artiste(Long idArtiste, String nom, String prenom, String genre, LocalDate dateDeNaissance, String pays, List<Morceau> morceauList) {
        IdArtiste = idArtiste;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.dateDeNaissance = dateDeNaissance;
        this.pays = pays;
        this.morceauList = morceauList;
    }

    public List<Morceau> getMorceauList() {
        return morceauList;
    }

    public void setMorceauList(List<Morceau> morceauList) {
        this.morceauList = morceauList;
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


    public String toString() {
        return prenom+" "+nom;
    }
}
