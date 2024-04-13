package com.example.projetjava.DataClasses;

public class Groupe {
    private String diplome;
    private String specialite;
    private String id_groupe;
    public Groupe(String diplome, String specialte) {
        this.diplome = diplome;
        this.specialite = specialite;
        this.id_groupe = diplome +" : "+specialte;

    }

    public String getId_groupe() {
        return id_groupe;
    }

    public void setId_groupe(String id_groupe) {
        this.id_groupe = id_groupe;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}

