package com.example.tapisirisi.logic.model;

import java.sql.Blob;

public class Motif {
    private long id;
    private byte[] drawable;
    private String libelle;

    public Motif() {
    }

    public Motif(byte[] drawable, String libelle) {
        this.drawable = drawable;
        this.libelle = libelle;
    }

    public Motif(long id, byte[] drawable, String libelle) {
        this.id = id;
        this.drawable = drawable;
        this.libelle = libelle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getDrawable() {
        return drawable;
    }

    public void setDrawable(byte[] drawable) {
        this.drawable = drawable;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
