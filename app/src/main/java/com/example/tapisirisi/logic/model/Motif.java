package com.example.tapisirisi.logic.model;

import java.sql.Blob;
import java.util.List;

public class Motif {
    private long id;
    private Blob image;
    private String libelle;
    private List<Propriete> proprietes;

    public Motif(long id, Blob image, String libelle, List<Propriete> proprietes) {
        this.id = id;
        this.image = image;
        this.libelle = libelle;
        this.proprietes = proprietes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Propriete> getProprietes() {
        return proprietes;
    }

    public void setProprietes(List<Propriete> proprietes) {
        this.proprietes = proprietes;
    }
}
