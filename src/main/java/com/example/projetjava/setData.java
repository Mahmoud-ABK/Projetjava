package com.example.projetjava;


import com.example.projetjava.DataClasses.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.sql.*;

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

        }catch(SQLIntegrityConstraintViolationException e){
           /* Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("cette CIN deja existe");
            alert.showAndWait();
*/
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void addEnseignant(Enseignant enseignant){
        String sql = "insert into enseignant values(?,?,?,?,?)";
        connection=database.connectDb();
        try{
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,enseignant.getCin());
            preparedStatement.setString(2,enseignant.getNom());
            preparedStatement.setString(3,enseignant.getPrenom());
            preparedStatement.setString(4,enseignant.getEmail());
            preparedStatement.setString(5, enseignant.getPosition());
            preparedStatement.executeUpdate();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addPFE(PFE pfe){
        String sql = "insert into PFE values(?,?,?,?)";
        connection=database.connectDb();
        try{
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,pfe.getTitre_pfe());
            preparedStatement.setString(2,pfe.getEnseignant());
            preparedStatement.setString(3,pfe.getEtudiant1());
            preparedStatement.setString(4,pfe.getEtudiant2());
            preparedStatement.executeUpdate();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addJury(Jury jury){
        String sql = "insert into Jury values(?,?,?,?,?,?)";
        String encadrant = getData.getJury_Encadrant(jury.getTitre_pfe());
        connection=database.connectDb();
        try{
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, jury.getTitre_pfe());
            preparedStatement.setString(2, jury.getPresident());
            preparedStatement.setString(3, jury.getExaminateur());
            preparedStatement.setString(4, jury.getRapporteur());
            preparedStatement.setString(5, jury.getEnseignant());
            preparedStatement.setString(6, jury.getInvite());
            preparedStatement.executeUpdate();

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void addSoutenance(soutenance s){
        String sql = "insert into soutenance values(?,?,?,?,?,?)";
        connection=database.connectDb();
        try{
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,s.getTitre_pfe());
            preparedStatement.setString(2,s.getDate());
            preparedStatement.setString(3,s.getHeure());
            preparedStatement.setString(4,s.getSalle());
            preparedStatement.setFloat(5,s.getNote());
            preparedStatement.setString(6,s.getValidite());
            preparedStatement.executeUpdate();


        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

}
