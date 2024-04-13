package com.example.projetjava.DataClasses;

public class Etudiant extends Personne {
    private String groupe;
    public Etudiant(String cin, String nom, String prenom, String position,String groupe) {
        super(cin, nom, prenom, position);
        this.groupe = groupe;
    }
    public String getGroupe() {return groupe;}
    public void setGroupe(String groupe) {this.groupe = groupe;}

}
