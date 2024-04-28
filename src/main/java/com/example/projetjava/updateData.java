package com.example.projetjava;
import com.example.projetjava.DataClasses.Enseignant;
import com.example.projetjava.DataClasses.Etudiant;

import com.example.projetjava.DataClasses.PFE;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.sql.*;

public class updateData {
    static private Connection connection;
    static private PreparedStatement preparedStatement;
    static private ResultSet resultSet;

    public static void updateEtudiants(Etudiant etudiant) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if(!getData.existeDansEtudiants(etudiant.getCin())){
            alert.setTitle("Erreur");
            alert.setHeaderText("Cin n'existe pas");
            alert.showAndWait();
        } else {
            String sql = "update etudiant set nom = ? , prenom= ?, email= ? ,filiere =? where id = ?";
            connection=database.connectDb();
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, etudiant.getNom());
                preparedStatement.setString(2, etudiant.getPrenom());
                preparedStatement.setString(3, etudiant.getEmail());
                preparedStatement.setString(4, etudiant.getFiliere());
                preparedStatement.setString(5, etudiant.getCin());
                preparedStatement.executeUpdate();
                alert.setAlertType(Alert.AlertType.INFORMATION);
                alert.setTitle("modification");
                alert.setHeaderText("modification effectué avec succès");
                alert.showAndWait();


            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void updateEnseignant(Enseignant enseignant) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if(!getData.existeDansEnseignants(enseignant.getCin())){
            alert.setTitle("Erreur");
            alert.setHeaderText("Cin n'existe pas");
            alert.showAndWait();
        } else {
            String sql = "update enseignant set nom = ? , prenom= ?, email= ? ,position =? where id = ?";
            connection=database.connectDb();
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, enseignant.getNom());
                preparedStatement.setString(2, enseignant.getPrenom());
                preparedStatement.setString(3, enseignant.getEmail());
                preparedStatement.setString(4, enseignant.getPosition());
                preparedStatement.setString(5, enseignant.getCin());
                preparedStatement.executeUpdate();
                alert.setAlertType(Alert.AlertType.INFORMATION);
                alert.setTitle("modification");
                alert.setHeaderText("modification effectué avec succès");
                alert.showAndWait();


            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void updatePFE(PFE pfe) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if(!getData.existePfeDansPFE(pfe.getTitre_pfe())){
            alert.setTitle("Erreur");
            alert.setHeaderText("Ce titre n'existe pas");
            alert.showAndWait();
        } else {
            String sql = "update pfe set id_enseignant= ?, id_etudiant1= ? ,id_etudiant2 =? where titre_pfe = ?";
            connection=database.connectDb();
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, pfe.getEnseignant());
                preparedStatement.setString(2, pfe.getEtudiant1());
                preparedStatement.setString(3, pfe.getEtudiant2());
                preparedStatement.setString(4, pfe.getTitre_pfe());
                preparedStatement.executeUpdate();
                alert.setAlertType(Alert.AlertType.INFORMATION);
                alert.setTitle("modification");
                alert.setHeaderText("modification effectué avec succès");
                alert.showAndWait();


            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
