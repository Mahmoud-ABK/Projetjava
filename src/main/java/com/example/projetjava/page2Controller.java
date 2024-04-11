package com.example.projetjava;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import javafx.event.ActionEvent;

public class page2Controller {

    @FXML
    private Button Acceuil_btn;

    @FXML
    private AnchorPane Acceuil_form;

    @FXML
    private Button Etudiant_btn;

    @FXML
    private AnchorPane Etudiant_form;

    @FXML
    private AnchorPane RIGHT;

    @FXML
    private AnchorPane TOP;

    @FXML
    private Label WELCO;

    @FXML
    private Label ajoutetudiant;

    @FXML
    private Button bouton;

    @FXML
    private Button boutonajout;

    @FXML
    private Button close;

    public void switchForm(ActionEvent event) {
        if(event.getSource() == Acceuil_btn) {
            Acceuil_form.setVisible(true);
            Etudiant_form.setVisible(false);
            Acceuil_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #0F50A2, #A4D8FF)");
            Etudiant_btn.setStyle("-fx-background-color: transparent");
        }else if(event.getSource() == Etudiant_btn) {
            Acceuil_form.setVisible(false);
            Etudiant_form.setVisible(true);
            Etudiant_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #0F50A2, #A4D8FF)");
            Acceuil_btn.setStyle("-fx-background-color: transparent");
        }


    }
}

