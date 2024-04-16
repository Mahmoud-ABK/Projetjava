package com.example.projetjava;

import com.example.projetjava.DataClasses.Etudiant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class getData {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    public ObservableList<Etudiant> getEtudiants() {
        ObservableList<Etudiant> listEtudiant = FXCollections.observableArrayList();
        String sql = "SELECT * FROM etudiant";
        connection =database.connectDb();

        try {
            preparedStatement = connection.prepareStatement(sql);
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
}
