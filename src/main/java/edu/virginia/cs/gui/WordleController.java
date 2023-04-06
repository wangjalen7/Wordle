package edu.virginia.cs.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class WordleController {

    private int hindex = 0;

    private int tindex = 0;

    @FXML
    private VBox root;

    private HBox h;
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
    private Label label10 = new Label();
    @FXML
    private Label label11 = new Label();
    @FXML
    private Label label12 = new Label();
    @FXML
    private Label label13 = new Label();
    @FXML
    private Label label14 = new Label();
    @FXML
    private Label label20 = new Label();
    @FXML
    private Label label21 = new Label();
    @FXML
    private Label label22 = new Label();
    @FXML
    private Label label23 = new Label();
    @FXML
    private Label label24 = new Label();
    @FXML
    private Label label30 = new Label();
    @FXML
    private Label label31 = new Label();
    @FXML
    private Label label32 = new Label();
    @FXML
    private Label label33 = new Label();
    @FXML
    private Label label34 = new Label();
    @FXML
    private Label label40 = new Label();
    @FXML
    private Label label41 = new Label();
    @FXML
    private Label label42 = new Label();
    @FXML
    private Label label43 = new Label();
    @FXML
    private Label label44 = new Label();



    @FXML
    protected void onHelloButtonClick() {
        String guess = word.getText();
    }

    @FXML
    protected void onButtonPressed(KeyEvent event){
        if(event.getEventType().equals(KeyEvent.KEY_PRESSED)){
                h = (HBox) root.getChildren().get(hindex);
                word = (TextField) h.getChildren().get(tindex);
                word.setText(event.getCharacter());
                if(tindex == 4){
                    hindex++;
                    tindex = 0;
                }
                else
                    tindex++;
        }
    }

    @FXML
    protected void handleYesButton() {
    }

    @FXML
    protected void handleNoButton() {

    }
}




