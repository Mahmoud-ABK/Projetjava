package com.example.projetjava.DataClasses;

public class Etudiant extends Personne {
    private String groupe;
    public Etudiant(String cin, String nom, String prenom,String groupe) {
        super(cin, nom, prenom, "Etudiant");
        this.groupe = groupe;
    }
    public String getGroupe() {return groupe;}
    public void setGroupe(String groupe) {this.groupe = groupe;}

}
