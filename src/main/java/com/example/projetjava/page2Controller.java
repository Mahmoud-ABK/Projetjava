package com.example.projetjava;

import com.example.projetjava.DataClasses.Etudiant;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class page2Controller {

    @FXML
    private Button Acceuil_btn;

    @FXML
    private AnchorPane Acceuil_form;

    @FXML
    private TableView<?> Enseignant_Table_View;

    @FXML
    private Button Enseignant_btn;

    @FXML
    private TableColumn<?, ?> Enseignant_col_ID;

    @FXML
    private TableColumn<?, ?> Enseignant_col_nom;

    @FXML
    private TableColumn<?, ?> Enseignant_col_prenom;

    @FXML
    private AnchorPane Enseignant_form;

    @FXML
    private TextField Etudiant_Email;

    @FXML
    private TextField Etudiant_ID;

    @FXML
    private TableView<Etudiant> Etudiant_Table_View;

    @FXML
    private Button Etudiant_btn;

    @FXML
    private TableColumn<Etudiant, String> Etudiant_col_ID;

    @FXML
    private TableColumn<Etudiant, String> Etudiant_col_email;

    @FXML
    private TableColumn<Etudiant, String> Etudiant_col_filiere;

    @FXML
    private TableColumn<Etudiant, String> Etudiant_col_nom;

    @FXML
    private TableColumn<Etudiant, String> Etudiant_col_prenom;

    @FXML
    private ComboBox<?> Etudiant_filiere;

    @FXML
    private AnchorPane Etudiant_form;

    @FXML
    private TextField Etudiant_nom;

    @FXML
    private TextField Etudiant_prenom;

    @FXML
    private TextField Etudiant_recherche;

    @FXML
    private Button Jury_btn;

    @FXML
    private TableColumn<?, ?> Jury_col_encadrant;

    @FXML
    private TableColumn<?, ?> Jury_col_examinateur;

    @FXML
    private TableColumn<?, ?> Jury_col_invite;

    @FXML
    private TableColumn<?, ?> Jury_col_president;

    @FXML
    private TableColumn<?, ?> Jury_col_rapporteur;

    @FXML
    private TableColumn<?, ?> Jury_col_titre;

    @FXML
    private AnchorPane Jury_form;

    @FXML
    private TableView<?> Jury_table_view;

    @FXML
    private TableColumn<?, ?> PFE_col_encadrant;

    @FXML
    private TableColumn<?, ?> PFE_col_etudiant1;

    @FXML
    private TableColumn<?, ?> PFE_col_etudiant2;

    @FXML
    private TableColumn<?, ?> PFE_col_titre;

    @FXML
    private TableView<?> PFE_table_view;

    @FXML
    private Button Pfe_btn;

    @FXML
    private AnchorPane Pfe_form;

    @FXML
    private AnchorPane RIGHT;

    @FXML
    private Button Soutenance_btn;

    @FXML
    private TableColumn<?, ?> Soutenance_col_date;

    @FXML
    private TableColumn<?, ?> Soutenance_col_heure;

    @FXML
    private TableColumn<?, ?> Soutenance_col_note;

    @FXML
    private TableColumn<?, ?> Soutenance_col_salle;

    @FXML
    private TableColumn<?, ?> Soutenance_col_titre;

    @FXML
    private TableColumn<?, ?> Soutenance_col_validite;

    @FXML
    private AnchorPane Soutenance_form;

    @FXML
    private TableView<?> Soutenance_table_view;

    @FXML
    private AnchorPane TOP;

    @FXML
    private Label WELCO;

    @FXML
    private Button ajouter_enseignant;

    @FXML
    private Button ajouter_etudiant;

    @FXML
    private Button ajouter_pfe;

    @FXML
    private Button ajouter_soutenance;

    @FXML
    private Label ajoutetudiant;

    @FXML
    private Label ajoutetudiant1;

    @FXML
    private Button boutonjury;

    @FXML
    private Button close;

    @FXML
    private Label jurycreation;

    @FXML
    private Button modifier_enseignant;

    @FXML
    private Button modifier_etudiant;

    @FXML
    private Button modifier_jury;

    @FXML
    private Button modifier_pfe;

    @FXML
    private Button modifier_soutenance;

    @FXML
    private Label planification;

    @FXML
    private BarChart<?, ?> soutenu_chart;

    @FXML
    private Button supprimer_enseignant;

    @FXML
    private Button supprimer_etudiant;

    @FXML
    private Button supprimer_jury;

    @FXML
    private Button supprimer_pfe;

    @FXML
    private Button supprimer_soutenance;

    @FXML
    private Label total_affecte;

    @FXML
    private Label total_etudiants;

    @FXML
    private Label total_nonaffecte;
// page Etudiants
    private ObservableList<Etudiant> Etudiants;
    public void displayEtudiants(){
        Etudiants=getData.getEtudiants();
        try{
        Etudiant_col_ID.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("cin"));
        Etudiant_col_nom.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("nom"));
        Etudiant_col_prenom.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("prenom"));
        Etudiant_col_email.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("email"));
        Etudiant_col_filiere.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("filiere"));
        Etudiant_Table_View.setItems(Etudiants);}
        catch(Exception e){
            e.printStackTrace();
        }



    }
    public void switchForm(ActionEvent event) {
        if(event.getSource() == Acceuil_btn) {
            //Transition
            Acceuil_form.setVisible(true);
            Etudiant_form.setVisible(false);
            Enseignant_form.setVisible(false);
            Jury_form.setVisible(false);
            Pfe_form.setVisible(false);
            Soutenance_form.setVisible(false);
            Acceuil_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #0F50A2, #A4D8FF)");
            Etudiant_btn.setStyle("-fx-background-color: transparent");
            Enseignant_btn.setStyle("-fx-background-color: transparent");
            Jury_btn.setStyle("-fx-background-color: transparent");
            Pfe_btn.setStyle("-fx-background-color: transparent");
            Soutenance_btn.setStyle("-fx-background-color: transparent");
        }else if(event.getSource() == Etudiant_btn) {
            //Transition
            Acceuil_form.setVisible(false);
            Etudiant_form.setVisible(true);
            Enseignant_form.setVisible(false);
            Jury_form.setVisible(false);
            Pfe_form.setVisible(false);
            Soutenance_form.setVisible(false);
            Acceuil_btn.setStyle("-fx-background-color: transparent");
            Etudiant_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #0F50A2, #A4D8FF)");
            Enseignant_btn.setStyle("-fx-background-color: transparent");
            Jury_btn.setStyle("-fx-background-color: transparent");
            Pfe_btn.setStyle("-fx-background-color: transparent");
            Soutenance_btn.setStyle("-fx-background-color: transparent");
            displayEtudiants();
        }else if(event.getSource() == Enseignant_btn) {
            //Transition
            Acceuil_form.setVisible(false);
            Etudiant_form.setVisible(false);
            Enseignant_form.setVisible(true);
            Jury_form.setVisible(false);
            Pfe_form.setVisible(false);
            Soutenance_form.setVisible(false);
            Acceuil_btn.setStyle("-fx-background-color: transparent");
            Etudiant_btn.setStyle("-fx-background-color: transparent");
            Enseignant_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #0F50A2, #A4D8FF)");
            Jury_btn.setStyle("-fx-background-color: transparent");
            Pfe_btn.setStyle("-fx-background-color: transparent");
            Soutenance_btn.setStyle("-fx-background-color: transparent");
        }else if(event.getSource() == Jury_btn) {
            //Transition
            Acceuil_form.setVisible(false);
            Etudiant_form.setVisible(false);
            Enseignant_form.setVisible(false);
            Jury_form.setVisible(true);
            Pfe_form.setVisible(false);
            Soutenance_form.setVisible(false);
            Acceuil_btn.setStyle("-fx-background-color: transparent");
            Etudiant_btn.setStyle("-fx-background-color: transparent");
            Enseignant_btn.setStyle("-fx-background-color: transparent");
            Jury_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #0F50A2, #A4D8FF)");
            Pfe_btn.setStyle("-fx-background-color: transparent");
            Soutenance_btn.setStyle("-fx-background-color: transparent");
        }else if(event.getSource() == Pfe_btn) {
            //Transition
            Acceuil_form.setVisible(false);
            Etudiant_form.setVisible(false);
            Enseignant_form.setVisible(false);
            Jury_form.setVisible(false);
            Pfe_form.setVisible(true);
            Soutenance_form.setVisible(false);
            Acceuil_btn.setStyle("-fx-background-color: transparent");
            Etudiant_btn.setStyle("-fx-background-color: transparent");
            Enseignant_btn.setStyle("-fx-background-color: transparent");
            Jury_btn.setStyle("-fx-background-color: transparent");
            Pfe_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #0F50A2, #A4D8FF)");
            Soutenance_btn.setStyle("-fx-background-color: transparent");
        }else if(event.getSource() == Soutenance_btn) {
            //Transition
            Acceuil_form.setVisible(false);
            Etudiant_form.setVisible(false);
            Enseignant_form.setVisible(false);
            Jury_form.setVisible(false);
            Pfe_form.setVisible(false);
            Soutenance_form.setVisible(true);
            Acceuil_btn.setStyle("-fx-background-color: transparent");
            Etudiant_btn.setStyle("-fx-background-color: transparent");
            Enseignant_btn.setStyle("-fx-background-color: transparent");
            Jury_btn.setStyle("-fx-background-color: transparent");
            Pfe_btn.setStyle("-fx-background-color: transparent");
            Soutenance_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #0F50A2, #A4D8FF)");
        }


    }
    public void initialize() {
        displayEtudiants();
    }

}

