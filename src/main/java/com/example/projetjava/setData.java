package com.example.projetjava;


import com.example.projetjava.DataClasses.Etudiant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class setData {
    static private Connection connection;
    static private PreparedStatement preparedStatement;
    static private ResultSet resultSet;
    public static void addEtudiant(Etudiant etudiant){
        String sql = "insert into etudiant values(?,?,?,?,?)";
        connection=database.connectDb();
        try{
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,etudiant.getCin());
            preparedStatement.setString(2,etudiant.getNom());
            preparedStatement.setString(3,etudiant.getPrenom());
            preparedStatement.setString(4,etudiant.getEmail());
            preparedStatement.setString(5, etudiant.getFiliere());
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
