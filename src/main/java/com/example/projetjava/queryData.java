package com.example.projetjava;
import com.example.projetjava.DataClasses.Enseignant;
import com.example.projetjava.DataClasses.Etudiant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.sql.*;

public class queryData {
    static private Connection connection;
    static private PreparedStatement preparedStatement;
    static private ResultSet resultSet;
    public static ObservableList<Etudiant> getQueryEtudiants(String data) {
        ObservableList<Etudiant> listEtudiant = FXCollections.observableArrayList();
        String sql = "SELECT * FROM etudiant where UPPER(id) like CONCAT(?,'%') OR UPPER(nom) like CONCAT(?,'%') OR UPPER(prenom) like CONCAT(?,'%')";
        connection =database.connectDb();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, data.toUpperCase());
            preparedStatement.setString(2, data.toUpperCase());
            preparedStatement.setString(3, data.toUpperCase());
            resultSet = preparedStatement.executeQuery();
            Etudiant etudiant;
            while (resultSet.next()) {
                etudiant=new Etudiant(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5));
                listEtudiant.add(etudiant);
            }
        }catch (Exception e){e.printStackTrace();}


        return listEtudiant;
    }

    public static ObservableList<Enseignant> getQueryEnseignants(String data) {
        ObservableList<Enseignant> listEnseignant = FXCollections.observableArrayList();
        String sql = "SELECT * FROM enseignant where UPPER(id) like CONCAT(?,'%') OR UPPER(nom) like CONCAT(?,'%') OR UPPER(prenom) like CONCAT(?,'%')";
        connection =database.connectDb();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, data.toUpperCase());
            preparedStatement.setString(2, data.toUpperCase());
            preparedStatement.setString(3, data.toUpperCase());
            resultSet = preparedStatement.executeQuery();
            Enseignant enseignant;
            while (resultSet.next()) {
                enseignant=new Enseignant(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5));
                listEnseignant.add(enseignant);
            }
        }catch (Exception e){e.printStackTrace();}


        return listEnseignant;
    }

}
