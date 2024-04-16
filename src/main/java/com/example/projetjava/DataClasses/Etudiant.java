package com.example.projetjava.DataClasses;

public class Etudiant  {
    private String filiere;
    private String email;
    private String cin;
    private String nom;
    private String prenom;
    public Etudiant(String cin, String nom, String prenom,String email,String filiere) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
        this.email = email;
    }
   /* public Etudiant(String cin, String nom, String prenom, String filiere) {
        super(cin, nom, prenom);
        this.filiere = filiere;

    }*/
    public String getCin(){
        return cin;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getFiliere() {return filiere;}
    public void setFiliere(String filiere) {this.filiere = filiere;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}



}
