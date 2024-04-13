package com.example.projetjava.DataClasses;

import java.util.Random;

public class Jury {
    private String president;
    private String rapporteur;
    private String examinateur;
    private String enseignant;
    private String encadrant_societe;
    private String id_jury;
    public Jury(String president, String rapporteur, String examinateur, String enseignant) {
        this.president = president;
        this.rapporteur = rapporteur;
        this.examinateur = examinateur;
        this.enseignant = enseignant;
        Random r = new Random( System.currentTimeMillis() );
        int gen= ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
        this.id_jury = "Jury no"+ gen;

    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getId_jury() {
        return id_jury;
    }

    public void setId_jury(String id_jury) {
        this.id_jury = id_jury;
    }

    public String getEncadrant_societe() {
        return encadrant_societe;
    }

    public void setEncadrant_societe(String encadrant_societe) {
        this.encadrant_societe = encadrant_societe;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    public String getExaminateur() {
        return examinateur;
    }

    public void setExaminateur(String examinateur) {
        this.examinateur = examinateur;
    }

    public String getRapporteur() {
        return rapporteur;
    }

    public void setRapporteur(String rapporteur) {
        this.rapporteur = rapporteur;
    }

}
class JuryData {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Random r = new Random( System.currentTimeMillis() );
            double gen= ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000)) + Math.random()*10000; ;
            System.out.println((int) gen);
        }
    }
}
