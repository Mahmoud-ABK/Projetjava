package com.example.projetjava.DataClasses;

public class PFE {
    private String titre_pfe;
    private String etudiant1;
    private String etudiant2;
    private String enseignant;

    public PFE(String titre_pfe, String etudiant1, String etudiant2, String enseignant) {
        this.titre_pfe = titre_pfe;
        this.etudiant1 = etudiant1;
        this.etudiant2 = etudiant2;
        this.enseignant = enseignant;
    }

    public PFE(String titre_pfe, String etudiant1, String enseignant) {
        this.titre_pfe = titre_pfe;
        this.etudiant1 = etudiant1;
        this.enseignant = enseignant;
    }

    public String getTitre_pfe() {
        return titre_pfe;
    }

    public void setTitre_pfe(String titre_pfe) {
        this.titre_pfe = titre_pfe;
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
