package edu.virginia.cs.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class WordleController {
    @FXML
    private TextField word;
    @FXML
    private HBox word0= new HBox();
    @FXML
    private HBox word1= new HBox();
    @FXML
    private HBox word2= new HBox();
    @FXML
    private HBox word3= new HBox();
    @FXML
    private HBox word4= new HBox();
    @FXML
    private Label welcomeText;
    @FXML
    private Label label00 = new Label();
    @FXML
    private Label label01 = new Label();
    @FXML
    private Label label02 = new Label();
    @FXML
    private Label label03 = new Label();
    @FXML
    private Label label04 = new Label();


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}