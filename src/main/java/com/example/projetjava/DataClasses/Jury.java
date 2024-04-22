package com.example.projetjava.DataClasses;

import java.util.Random;

public class Jury {
    private String president;
    private String rapporteur;
    private String examinateur;
    private String enseignant;
    private String invite ;
    private String titre_pfe;

    public Jury(String titre_pfe, String president, String rapporteur, String examinateur, String enseignant, String invite) {
        this.president = president;
        this.rapporteur = rapporteur;
        this.examinateur = examinateur;
        this.enseignant = enseignant;
        this.invite = invite;
        this.titre_pfe = titre_pfe;
    }

    public Jury(String titre_pfe, String president, String rapporteur, String examinateur, String enseignant) {
        this.president = president;
        this.rapporteur = rapporteur;
        this.examinateur = examinateur;
        this.enseignant = enseignant;
        this.titre_pfe = titre_pfe;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getRapporteur() {
        return rapporteur;
    }

    public void setRapporteur(String rapporteur) {
        this.rapporteur = rapporteur;
    }

    public String getExaminateur() {
        return examinateur;
    }

    public void setExaminateur(String examinateur) {
        this.examinateur = examinateur;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    public String getInvite() {
        return invite;
    }

    public void setInvite(String invite) {
        this.invite = invite;
    }

    public String getTitre_pfe() {
        return titre_pfe;
    }

    public void setTitre_pfe(String titre_pfe) {
        this.titre_pfe = titre_pfe;
    }
}
