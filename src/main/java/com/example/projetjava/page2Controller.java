package com.example.projetjava;

import com.example.projetjava.DataClasses.*;

import javafx.collections.FXCollections;
import com.example.projetjava.DataClasses.PFE;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javafx.event.ActionEvent;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class page2Controller {

    @FXML
    private Button Acceuil_btn;

    @FXML
    private AnchorPane Acceuil_form;

    @FXML
    private TableView<Enseignant> Enseignant_Table_View;

    @FXML
    private Button Enseignant_btn;

    @FXML
    private TableColumn<Enseignant, String> Enseignant_col_ID;

    @FXML
    private TableColumn<Enseignant, String> Enseignant_col_nom;

    @FXML
    private TableColumn<Enseignant, String> Enseignant_col_prenom;

    @FXML
    private TableColumn<Enseignant, String> Enseignant_col_email;

    @FXML
    private TableColumn<Enseignant, String> Enseignant_col_position;

    @FXML
    private TextField Enseignant_ID;

    @FXML
    private TextField Enseignant_nom;

    @FXML
    private TextField Enseignant_prenom;

    @FXML
    private TextField Enseignant_email;

    @FXML
    private ComboBox<String> Enseignant_position;

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
    private ComboBox<String> Etudiant_filiere;

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
    private TableColumn<Jury, String> Jury_col_encadrant;

    @FXML
    private TableColumn<Jury, String> Jury_col_examinateur;

    @FXML
    private TableColumn<Jury, String> Jury_col_invite;

    @FXML
    private TableColumn<Jury, String> Jury_col_president;

    @FXML
    private TableColumn<Jury, String> Jury_col_rapporteur;

    @FXML
    private TableColumn<Jury, String> Jury_col_titre;

    @FXML
    private AnchorPane Jury_form;

    @FXML
    private TableView<Jury> Jury_table_view;

    @FXML
    private TableColumn<PFE, String> PFE_col_encadrant;

    @FXML
    private TableColumn<PFE, String> PFE_col_etudiant1;

    @FXML
    private TableColumn<PFE, String> PFE_col_etudiant2;

    @FXML
    private TableColumn<PFE, String> PFE_col_titre;

    @FXML
    private TableView<PFE> PFE_table_view;

    @FXML
    private TextField PFE_titre;

    @FXML
    private ComboBox<String> PFE_encadrant;

    @FXML
    private ComboBox<String> PFE_etudiant1;

    @FXML
    private ComboBox<String> PFE_etudiant2;

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
    @FXML
    private DatePicker Soutenance_Date;

    @FXML
    private ComboBox<String> Soutenance_Heure;
    @FXML
    private ComboBox<String> Soutenance_Minute;


    @FXML
    private TextField Soutenance_Note;

    @FXML
    private TextField Soutenance_Salle;


    @FXML
    private ComboBox<String> Soutenance_filiere;


    @FXML
    private TextField Soutenance_recherche;


    @FXML
    private ComboBox<String> Soutenance_titrePFE;




    private ObservableList<PFE> PFES;
    @FXML
    private ImageView searchEtudiant;

    // PAGE ETUDIANT

    private ObservableList<Etudiant> Etudiants;

    public void fillComboBoxFiliere(){
        String[] filiere={"Master Pro:Genie Logiciel","Master Recherche:Genie Logiciel","License: sciences informatiqes","Cycle Ingenieur:Genie Logiciel"};
        Etudiant_filiere.setItems(FXCollections.observableArrayList(filiere));
    }
    public void ResetPageEtudiant(){
        Etudiant_ID.setText("");
        Etudiant_nom.setText("");
        Etudiant_prenom.setText("");
        Etudiant_Email.setText("");
        Etudiant_filiere.setItems(FXCollections.observableArrayList());

    }
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

    public void AjouterEtudiant(){
        String id=Etudiant_ID.getText();
        String nom=Etudiant_nom.getText();
        String prenom=Etudiant_prenom.getText();
        String email=Etudiant_Email.getText();
        String filiere=(String)Etudiant_filiere.getSelectionModel().getSelectedItem();
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if(id.isEmpty()||nom.isEmpty()||prenom.isEmpty()||email.isEmpty()|| Etudiant_filiere.getSelectionModel().isEmpty()){

            alert.setTitle("Erreur");
            alert.setHeaderText("Veuillez remplir les champs");

            alert.showAndWait();
        }else if (id.length()!=8){
            alert.setTitle("Erreur");
            alert.setHeaderText("Cin Invalide ");
            alert.setContentText("Cin doit etre egale a 8 chiffres ");
            alert.showAndWait();
        } else if (getData.existeDansEtudiants(id)) {

            alert.setTitle("Erreur");
            alert.setHeaderText("ce CIN deja existe");
            alert.showAndWait();

        } else{
        Etudiant etudiant=new Etudiant(Etudiant_ID.getText(),Etudiant_nom.getText(),Etudiant_prenom.getText(),Etudiant_Email.getText(),(String)Etudiant_filiere.getSelectionModel().getSelectedItem());
        setData.addEtudiant(etudiant);
        displayEtudiants();
        alert.setAlertType(Alert.AlertType.INFORMATION);
        alert.setTitle("Ajout Etudiant");
        alert.setHeaderText("Ajout Etudiant effectué avec succée");
        alert.showAndWait();
        ResetPageEtudiant();
        alert.showAndWait();
        }

    }

    public void ModifierEtudiant(){
        String id=Etudiant_ID.getText();
        String nom=Etudiant_nom.getText();
        String prenom=Etudiant_prenom.getText();
        String email=Etudiant_Email.getText();
        String filiere=(String)Etudiant_filiere.getSelectionModel().getSelectedItem();

        Alert alert = new Alert(Alert.AlertType.ERROR);
        if(id.isEmpty() || nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || Etudiant_filiere.getSelectionModel().isEmpty()){
            alert.setTitle("Erreur");
            alert.setHeaderText("Veuillez remplir les champs");
            alert.showAndWait();
        }else {
            alert.setAlertType(Alert.AlertType.INFORMATION);
            updateData.updateEtudiants(new Etudiant(id,nom,prenom,email,filiere));
            displayEtudiants();
            ResetPageEtudiant();

        }

    }

    public void SupprimerEtudiant(){
        String id=Etudiant_ID.getText();
        if(id.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Veuillez remplir le champ de Cin");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Vous êtes sur de supprimer cet etudiant");
            alert.showAndWait().ifPresent(response->{
                if (response == ButtonType.OK){
                    deleteData.deleteEtudiant(id);
                    displayEtudiants();
                    ResetPageEtudiant();
                }
            });


        }
    }

    public void rechercheEtudiant(){
            String data=Etudiant_recherche.getText();
            if(data.isEmpty()){
                displayEtudiants();
            }else {
                try{
                    Etudiant_col_ID.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("cin"));
                    Etudiant_col_nom.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("nom"));
                    Etudiant_col_prenom.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("prenom"));
                    Etudiant_col_email.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("email"));
                    Etudiant_col_filiere.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("filiere"));
                    Etudiant_Table_View.setItems(queryData.getQueryEtudiants(data));}
                catch(Exception e){
                    e.printStackTrace();
                }

            }
    }

    //PAGE ENSEIGNANT

    private ObservableList<Enseignant> Enseignants;
    public void displayEnseignant() {
        Enseignants = getData.getEnseignant();
        try {
            Enseignant_col_ID.setCellValueFactory(new PropertyValueFactory<Enseignant, String>("cin"));
            Enseignant_col_nom.setCellValueFactory(new PropertyValueFactory<Enseignant, String>("nom"));
            Enseignant_col_prenom.setCellValueFactory(new PropertyValueFactory<Enseignant, String>("prenom"));
            Enseignant_col_email.setCellValueFactory(new PropertyValueFactory<Enseignant, String>("Email"));
            Enseignant_col_position.setCellValueFactory(new PropertyValueFactory<Enseignant, String>("Position"));
            Enseignant_Table_View.setItems(Enseignants);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillComboBoxPosition(){
        String[] position={"Assistant","Maitre assistant","Maître de conférences","Professeur de l'enseignement supérieur"};
        Enseignant_position.setItems(FXCollections.observableArrayList(position));
    }

    public void AjouterEnseignant(){
        String id=Enseignant_ID.getText();
        String nom=Enseignant_nom.getText();
        String prenom=Enseignant_prenom.getText();
        String email=Enseignant_email.getText();
        String position=(String)Enseignant_position.getSelectionModel().getSelectedItem();
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if(id.isEmpty()||nom.isEmpty()||prenom.isEmpty()||email.isEmpty()|| Enseignant_position.getSelectionModel().isEmpty()){

            alert.setTitle("Erreur");
            alert.setHeaderText("Veuillez remplir les champs");

            alert.showAndWait();
        }else if (id.length()!=8){
            alert.setTitle("Erreur");
            alert.setHeaderText("Cin Invalide ");
            alert.setContentText("Cin doit etre egale a 8 chiffres ");
            alert.showAndWait();
        } else if (getData.existeEnseignant(id)) {

            alert.setTitle("Erreur");
            alert.setHeaderText("ce CIN deja existe");
            alert.showAndWait();

        } else{
            Enseignant enseignant=new Enseignant(Enseignant_ID.getText(),Enseignant_nom.getText(),Enseignant_prenom.getText(),Enseignant_email.getText(),(String)Enseignant_position.getSelectionModel().getSelectedItem());
            setData.addEnseignant(enseignant);
            displayEnseignant();
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setTitle("Ajout Enseignant");
            alert.setHeaderText("Ajout Enseignant effectué avec succée");
            alert.showAndWait();
        }

    }

    //PAGE PFE
    @FXML


    public void displayPFES() {
        PFES = getData.getPFE();
        try {
            PFE_col_titre.setCellValueFactory(new PropertyValueFactory<PFE, String>("titre_pfe"));
            PFE_col_encadrant.setCellValueFactory(new PropertyValueFactory<PFE, String>("enseignant"));
            PFE_col_etudiant1.setCellValueFactory(new PropertyValueFactory<PFE, String>("etudiant1"));
            PFE_col_etudiant2.setCellValueFactory(new PropertyValueFactory<PFE, String>("etudiant2"));
            PFE_table_view.setItems(PFES);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillComboBoxEncadrant(){
        PFE_encadrant.setItems(FXCollections.observableArrayList(getData.getEnseignant_ID()));
    }

    public void fillComboBoxEtudiant1(){
        PFE_etudiant1.setItems(FXCollections.observableArrayList(getData.getEtudiant_ID()));
    }

    public void fillComboBoxEtudiant2(){
        PFE_etudiant2.setItems(FXCollections.observableArrayList(getData.getEtudiant_ID()));
    }

    public void AjouterPFE(){
        String titre = PFE_titre.getText();
        String encadrant = (String)PFE_encadrant.getSelectionModel().getSelectedItem();
        String etudiant1 = (String)PFE_etudiant1.getSelectionModel().getSelectedItem();
        String etudiant2 = (String)PFE_etudiant2.getSelectionModel().getSelectedItem();
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if(titre.isEmpty()||PFE_encadrant.getSelectionModel().isEmpty()||PFE_etudiant1.getSelectionModel().isEmpty()||PFE_etudiant2.getSelectionModel().isEmpty()){

            alert.setTitle("Erreur");
            alert.setHeaderText("Veuillez remplir les champs");

            alert.showAndWait();
        }else if (etudiant1.equals(etudiant2)){
            alert.setTitle("Erreur!");
            alert.setHeaderText("Cin Invalide!");
            alert.setContentText("Cin de l'étudiant 2 doit etre different de Cin de l'étudiant 1");
            alert.showAndWait();
        } else if (getData.existePfe(titre)) {

            alert.setTitle("Erreur");
            alert.setHeaderText("ce titre existe déja!");
            alert.showAndWait();

        } else{
            PFE pfe = new PFE(PFE_titre.getText(),(String)PFE_encadrant.getSelectionModel().getSelectedItem(),(String)PFE_etudiant1.getSelectionModel().getSelectedItem(),(String)PFE_etudiant2.getSelectionModel().getSelectedItem());
            setData.addPFE(pfe);
            displayPFES();
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setTitle("Ajout Enseignant");
            alert.setHeaderText("Ajout Enseignant effectué avec succée");
            alert.showAndWait();
        }

    }

    // PAGE JURY

    private ObservableList<Jury> Jurys;
    public void displayJurys() {
        Jurys = getData.getJury();
        try {
            Jury_col_titre.setCellValueFactory(new PropertyValueFactory<Jury, String>("titre_pfe"));
            Jury_col_president.setCellValueFactory(new PropertyValueFactory<Jury, String>("president"));
            Jury_col_rapporteur.setCellValueFactory(new PropertyValueFactory<Jury, String>("rapporteur"));
            Jury_col_examinateur.setCellValueFactory(new PropertyValueFactory<Jury, String>("examinateur"));
            Jury_col_encadrant.setCellValueFactory(new PropertyValueFactory<Jury, String>("enseignant"));
            Jury_col_invite.setCellValueFactory(new PropertyValueFactory<Jury, String>("invite"));
            Jury_table_view.setItems(Jurys);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //page soutenance
    public void fillComboBoxTime(){
        ArrayList<String> heures=new ArrayList<>();
        ArrayList<String> minutes=new ArrayList<>();

        for (int i = 0; i <60; i++) {
            if(i<10){
                minutes.add("0"+i);
            }else {
                minutes.add(String.valueOf(i));
            }
        }
        for (int i = 7; i <18 ; i++) {
            if(i<10){
                heures.add("0"+i);

            }else {
                heures.add(String.valueOf(i));
            }

        }
       Soutenance_Minute.setItems(FXCollections.observableArrayList(minutes));
        Soutenance_Heure.setItems(FXCollections.observableArrayList(heures));

    }

    public void fillComboBoxTitrepfeSoutenance(){

        Soutenance_titrePFE.setItems(FXCollections.observableArrayList(getData.getPFE_Titre()));
    }
    public void prepareSoutenance(){
        String titre_pfe=(String) Soutenance_titrePFE.getSelectionModel().getSelectedItem();
        LocalDate dateSoutenance ;
        String heure = Soutenance_Heure.getSelectionModel().getSelectedItem();
        String minute=Soutenance_Minute.getSelectionModel().getSelectedItem();
        String salle= Soutenance_Salle.getText();
        String note= Soutenance_Note.getText();
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if (Soutenance_titrePFE.getSelectionModel().isEmpty()|| Soutenance_Date.getValue()==null|| Soutenance_Heure.getSelectionModel().isEmpty() || Soutenance_Minute.getSelectionModel().isEmpty()){
            alert.setTitle("Erreur");
            alert.setHeaderText("Veuillez remplir Les Champs ");
            alert.showAndWait();
        } else if (getData.existePfedansSoutenance(titre_pfe)) {
         alert.setTitle("Erreur");
         alert.setHeaderText("ce pfe deja a une soutenance");
         alert.showAndWait();

        } else {
            dateSoutenance=Soutenance_Date.getValue();
            if ( LocalDate.now().isBefore(dateSoutenance) && !(note.isEmpty()) ) {
                alert.setTitle("Erreur");
                alert.setHeaderText("Tu ne peux pas mettre le note avant la date de soutenance");
                alert.showAndWait();

            }else{
                soutenance sout;
                String valide="";
                if(note.isEmpty()){
                   sout=new soutenance(titre_pfe,dateSoutenance.toString(),heure+":"+minute,salle,0,valide);
                }
                else{
                    valide= (Float.parseFloat(note)>10)?"Validee":"non validee";
                    sout=new soutenance(titre_pfe,dateSoutenance.toString(),heure+":"+minute,salle,Float.parseFloat(note),valide);

                }
                setData.addSoutenance(sout);
                alert.setAlertType(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout Soutenance");
                alert.setHeaderText("Ajout Soutenance avec succee");

                System.out.println(sout.toString());
            }
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
            fillComboBoxFiliere();
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
            fillComboBoxPosition();
            displayEnseignant();
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
            displayJurys();
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
            fillComboBoxEncadrant();
            fillComboBoxEtudiant1();
            fillComboBoxEtudiant2();
            displayPFES();
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
            fillComboBoxTime();
            fillComboBoxTitrepfeSoutenance();
        }


    }
    public void initialize() {
        displayEtudiants();
    }

}

