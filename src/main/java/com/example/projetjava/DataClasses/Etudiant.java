package com.example.projetjava.DataClasses;

public class Etudiant extends Personne {
    private String filiere;
    private String email;
    public Etudiant(String cin, String nom, String prenom,String filiere, String email) {
        super(cin, nom, prenom);
        this.filiere = filiere;
        this.email = email;
    }
    public Etudiant(String cin, String nom, String prenom, String filiere) {
        super(cin, nom, prenom);
        this.filiere = filiere;

    }
    public String getFiliere() {return filiere;}
    public void setFiliere(String filiere) {this.filiere = filiere;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}



}
