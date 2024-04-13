package com.example.projetjava.DataClasses;

public class Personne {
    private String cin;
    private String nom;
    private String prenom;
    private String position;
    public Personne(String cin, String nom, String prenom, String position) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.position = position;
    }
    public String getCin() {return cin;}
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public String getPosition() {return position;}

    public void setCin(String cin) {
        this.cin = cin;
    }
    public void setNom(String nom) {
        this.nom = nom;

    }
    public void setPrenom(String prenom) {this.prenom = prenom;}

    public void setPosition(String position) {
        this.position = position;
    }
}
