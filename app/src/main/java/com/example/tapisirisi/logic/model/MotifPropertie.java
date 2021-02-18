package com.example.tapisirisi.logic.model;

public class MotifPropertie {
    private long id;
    private String libelle;
    private String description;

    public MotifPropertie() {
    }

    public MotifPropertie(String description, String libelle) {
        this.description = description;
        this.libelle = libelle;
    }

    public MotifPropertie(long id, String description, String libelle) {
        this.id = id;
        this.description = description;
        this.libelle = libelle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String drawable) {
        this.description = description;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

