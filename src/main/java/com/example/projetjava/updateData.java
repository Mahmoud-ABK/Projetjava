package com.example.projetjava;
import com.example.projetjava.DataClasses.Etudiant;

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
                alert.setHeaderText("modification effectué avec succée");
                alert.showAndWait();


            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
