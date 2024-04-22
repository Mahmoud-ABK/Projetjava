package com.example.projetjava.DataClasses;

public class Enseignant extends Personne{
    private String position;
    private String email;
    public Enseignant(String cin, String nom, String prenom, String position, String email) {
        super( cin,nom, prenom);
        this.email = email;
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
