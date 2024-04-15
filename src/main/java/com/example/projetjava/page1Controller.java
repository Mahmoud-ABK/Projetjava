package com.example.projetjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class page1Controller {
    private Connection connection ;
    private PreparedStatement preparedStatement ;
    private ResultSet rs ;
    public void testBD(){
        try {
            connection=database.connectDb();
            String sql="select * from etudiant";
            preparedStatement=connection.prepareStatement(sql);
            rs= preparedStatement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public void switchToScene2(ActionEvent event)  throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("page2.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        testBD();


    }
}