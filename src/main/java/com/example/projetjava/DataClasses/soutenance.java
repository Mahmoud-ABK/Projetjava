package com.example.projetjava.DataClasses;

import java.time.LocalDate;

public class soutenance {
    String titre_pfe;
    String date;
    String heure;
    String salle;
    float note;
    String validite="";
    public soutenance(String titre_pfe, String date, String heure, String salle, float note, String validite) {
        this.titre_pfe = titre_pfe;
        this.date = date;
        this.heure = heure;
        this.salle = salle;
        this.note = note;
        this.validite = validite;
    }

    public String getTitre_pfe() {
        return titre_pfe;
    }

    public void setTitre_pfe(String titre_pfe) {
        this.titre_pfe = titre_pfe;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public String getValidite() {
        return validite;
    }

    public void setValidite(String validite) {
        this.validite = validite;
    }
    public LocalDate getDateasDate(){
        return LocalDate.parse(date);
    }
}
