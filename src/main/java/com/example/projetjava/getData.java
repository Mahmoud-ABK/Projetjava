package com.example.projetjava;

import com.example.projetjava.DataClasses.Enseignant;
import com.example.projetjava.DataClasses.Etudiant;

import com.example.projetjava.DataClasses.Jury;
import com.example.projetjava.DataClasses.PFE;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class getData {
    static private Connection connection;
    static private PreparedStatement preparedStatement;
    static private ResultSet resultSet;
    public static ArrayList<String> etudiantsCIN=new ArrayList<>();
    public static ArrayList<String> enseignantsCIN=new ArrayList<>();
    public static ArrayList<String> pfeid=new ArrayList<>();

    public static ObservableList<Etudiant> getEtudiants() {
    ObservableList<Etudiant> listEtudiant = FXCollections.observableArrayList();
    String sql = "SELECT * FROM etudiant";
    connection =database.connectDb();

    try {
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        Etudiant etudiant;
        while (resultSet.next()) {
            etudiantsCIN.add(resultSet.getString(1));
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

    public static ObservableList<Enseignant> getEnseignant() {
        ObservableList<Enseignant> listEnseignant = FXCollections.observableArrayList();
        String sql = "SELECT * FROM enseignant";
        connection =database.connectDb();

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            Enseignant enseignant;
            while (resultSet.next()) {
                enseignant = new Enseignant(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5));
                listEnseignant.add(enseignant);
            }
        }catch (Exception e){e.printStackTrace();}

        return listEnseignant;
    }

    public static ObservableList<PFE> getPFE() {
        ObservableList<PFE> listPFE = FXCollections.observableArrayList();
        String sql = "SELECT * FROM PFE";
        connection =database.connectDb();

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            PFE Pfe;
            while (resultSet.next()) {
                Pfe = new PFE(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4));
                listPFE.add(Pfe);
            }
        }catch (Exception e){e.printStackTrace();}

        return listPFE;
    }

    public static ObservableList<Jury> getJury() {
        ObservableList<Jury> listJury = FXCollections.observableArrayList();
        String sql = "SELECT * FROM jury";
        connection =database.connectDb();
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            Jury jury;
            while (resultSet.next()) {
                jury = new Jury(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6));
                listJury.add(jury);
            }
        }catch (Exception e){e.printStackTrace();}

        return listJury;
    }

    public static boolean existeDansEtudiants(String cin) {
        connection=database.connectDb();
        String sql = "SELECT * FROM etudiant ";
        try{
            preparedStatement=connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {

                if(cin.equals(resultSet.getString(1))){
                    return true;
                }
            }

        }catch (Exception e){e.printStackTrace();}
        return false;
    }

    public static boolean existeEnseignant(String cin) {
        connection=database.connectDb();
        String sql = "SELECT * FROM enseignant ";
        try{
            preparedStatement=connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {

                if(cin.equals(resultSet.getString(1))){
                    return true;
                }
            }

        }catch (Exception e){e.printStackTrace();}
        return false;
    }

    public static boolean existePfe(String cin) {
        connection=database.connectDb();
        String sql = "SELECT * FROM pfe ";
        try{
            preparedStatement=connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {

                if(cin.equals(resultSet.getString(1))){
                    return true;
                }
            }

        }catch (Exception e){e.printStackTrace();}
        return false;
    }
}

