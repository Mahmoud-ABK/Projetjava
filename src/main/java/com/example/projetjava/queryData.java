package com.example.projetjava;
import com.example.projetjava.DataClasses.Enseignant;
import com.example.projetjava.DataClasses.Etudiant;

import com.example.projetjava.DataClasses.*;
import com.example.projetjava.DataClasses.PFE;
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

    public static ObservableList<Jury> getQueryJury(String data) {
        ObservableList<Jury> listJury = FXCollections.observableArrayList();
        String sql = "SELECT * FROM Jury where UPPER(titre_pfe)like CONCAT(?,'%') ";
        connection =database.connectDb();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, data.toUpperCase());

            resultSet = preparedStatement.executeQuery();
            Jury jury ;
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
    public static ObservableList<PFE> getQueryPFE(String data) {
        ObservableList<PFE> list = FXCollections.observableArrayList();
        String sql = "SELECT * FROM pfe where UPPER(titre_pfe) like CONCAT(?,'%') ";
        connection =database.connectDb();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, data.toUpperCase());

            resultSet = preparedStatement.executeQuery();
            PFE Pfe;
            while (resultSet.next()) {
                Pfe = new PFE(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4));
                System.out.println(Pfe);

                list.add(Pfe);
            }
        }catch (Exception e){e.printStackTrace();}


        return list;
    }
public static ObservableList<soutenance> getQuerySoutenance(String data) {
    ObservableList<soutenance> list = FXCollections.observableArrayList();
    String sql = "SELECT * FROM soutenance where UPPER(titre_pfe)like CONCAT(?,'%') ";
    connection =database.connectDb();

    try {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, data.toUpperCase());

        resultSet = preparedStatement.executeQuery();
        soutenance sout;
        while (resultSet.next()) {
            sout = new soutenance(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getFloat(5),
                    resultSet.getString(6));


        list.add(sout);
    }
}catch (Exception e){e.printStackTrace();}


        return list;
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
