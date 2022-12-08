package com.supinfo.projetmasterspringboot.model;

import javax.persistence.*;

@Entity
@Table(name = "morceau")
public class Morceau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMorceau;
    private String titreMorceau;
    private Long Duree;
    @ManyToOne
    @JoinColumn(name = "id_artiste")
    private Artiste artiste;

    public Artiste getArtiste() {
        return artiste;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    public Long getIdMorceau() {
        return idMorceau;
    }

    public void setIdMorceau(Long idMorceau) {
        this.idMorceau = idMorceau;
    }

    public String getTitreMorceau() {
        return titreMorceau;
    }

    public void setTitreMorceau(String titreMorceau) {
        this.titreMorceau = titreMorceau;
    }

    public Long getDuree() {
        return Duree;
    }

    public void setDuree(Long duree) {
        Duree = duree;
    }

    @Override
    public String toString() {
        return "Morceau{" +
                "idMorceau=" + idMorceau +
                ", titreMorceau='" + titreMorceau + '\'' +
                ", Duree=" + Duree +
                ", artiste=" + artiste +
                '}';
    }
}
