package com.example.projetjava.DataClasses;

public class PFE {
    private String titre_sujet;
    private String etudiant1;
    private String etudiant2;
    private String enseignant;

    public PFE(String titre_sujet, String etudiant1, String etudiant2, String enseignant) {
        this.titre_sujet = titre_sujet;
        this.etudiant1 = etudiant1;
        this.etudiant2 = etudiant2;
        this.enseignant = enseignant;
    }

    public PFE(String titre_sujet, String etudiant1, String enseignant) {
        this.titre_sujet = titre_sujet;
        this.etudiant1 = etudiant1;
        this.enseignant = enseignant;
    }

    public String getTitre_sujet() {
        return titre_sujet;
    }

    public void setTitre_sujet(String titre_sujet) {
        this.titre_sujet = titre_sujet;
    }

    public String getEtudiant1() {
        return etudiant1;
    }

    public void setEtudiant1(String etudiant1) {
        this.etudiant1 = etudiant1;
    }

    public String getEtudiant2() {
        return etudiant2;
    }

    public void setEtudiant2(String etudiant2) {
        this.etudiant2 = etudiant2;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }
}
