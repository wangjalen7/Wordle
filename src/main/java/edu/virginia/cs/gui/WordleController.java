package edu.virginia.cs.gui;

import edu.virginia.cs.wordle.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.security.Key;

public class WordleController {

    public Label playAgain;
    @FXML
    private Button checkButton;
    public Button yesButton;
    public Button noButton;

    private int hindex = 1;

    private int tindex = 0;

    private String[] line_word = new String[5];

    private int[] arr = new int[]{6,1,5,2,3};
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

    Wordle wordle = new WordleImplementation();


    @FXML
    protected void onHelloButtonClick() {
        String guess = word.getText();
    }

    @FXML
    protected void onButtonPressed(KeyEvent event){
        if(event.getCode().isLetterKey()){
            System.out.println(event.getCode() + " " + root.getChildren().get(1));
            h = (HBox) root.getChildren().get(hindex);
                word = (TextField) h.getChildren().get(tindex);
                word.setText(event.getText());
                word.setStyle("text-area-background: green;");
                if(tindex == 4){
                    for(int i = 0;i<h.getChildren().size();i++) {
                        word = (TextField) h.getChildren().get(i);
                        line_word[i] = word.getText();
                        word.setDisable(true);
                    }
                    hindex++;
                    tindex = 0;
                }
                else
                    tindex++;
            h = (HBox) root.getChildren().get(hindex);
            word = (TextField) h.getChildren().get(tindex);
            word.requestFocus();
        }
        if(event.getCode().equals(KeyCode.BACK_SPACE)){
            System.out.println(event.getCode() + " Back");
            h = (HBox) root.getChildren().get(hindex);
                word = (TextField) h.getChildren().get(tindex);
                word.clear();
        }

        if(event.getCode().equals(KeyCode.LEFT)){
            System.out.println(event.getCode() + " Left");

            h = (HBox) root.getChildren().get(arr[hindex]);
            if(tindex > 0){
                tindex--;
                word = (TextField) h.getChildren().get(tindex);
            }
            h = (HBox) root.getChildren().get(hindex);
            word = (TextField) h.getChildren().get(tindex);
            word.requestFocus();
        }

        if(event.getCode().equals(KeyCode.RIGHT)){
            System.out.println(event.getCode() + " Right");

            h = (HBox) root.getChildren().get(arr[hindex]);
            if(tindex < 4){
                tindex++;
                word = (TextField) h.getChildren().get(tindex);
            }
            h = (HBox) root.getChildren().get(hindex);
            word = (TextField) h.getChildren().get(tindex);
            word.requestFocus();
        }
    }

    @FXML
    protected void gameOver(){
        if(wordle.isGameOver()){
            playAgain.setVisible(true);
            yesButton.setVisible(true);
            noButton.setVisible(true);


        }
    }

    @FXML
    protected void handleYesButton() {
    }

    @FXML
    protected void handleNoButton() {

    }}




