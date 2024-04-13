package com.example.projetjava.DataClasses;

public class Groupe {
    private String diplome;
    private String specialite;
    private String id_groupe;
    public Groupe(String diplome, String specialite) {
        this.diplome = diplome;
        this.specialite = specialite;
        this.id_groupe = diplome +" : "+specialite;

    }

    public String getId_groupe() {
        return id_groupe;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
        this.id_groupe = diplome +" : "+specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
        this.id_groupe = diplome +" : "+specialite;
    }
}

