package com.example.projetjava;
import com.example.projetjava.DataClasses.Etudiant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.sql.*;

public class deleteData {
    static private Connection connection;
    static private PreparedStatement preparedStatement;
    static private ResultSet resultSet;

    public static void deleteEtudiant(String cin) {
        if (getData.existeDansEtudiants(cin)==false) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Cin inexistant");
            alert.showAndWait();
        }else {
            String sql = "DELETE FROM etudiant WHERE id = ?";
            connection=database.connectDb();
            try{
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, cin);
            preparedStatement.executeUpdate();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Etudiant supprimé avec succée");
            alert.showAndWait();



            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
