package edu.virginia.cs.gui;

import edu.virginia.cs.wordle.*;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import java.lang.Exception;

import java.security.Key;

import static javafx.scene.paint.Color.*;
import static javafx.scene.paint.Color.TRANSPARENT;

public class WordleController {

    public WordleImplementation game = new WordleImplementation();
    public WordleImplementation wordle = new WordleImplementation();

    @FXML
    public Label playAgain = new Label() ;
    @FXML
    private Button checkButton = new Button();
    public Button yesButton = new Button();
    public Button noButton = new Button();

    private int hindex = 1;

    private int tindex = 0;

    private String line_word = "";

    private int[] arr = new int[]{6,1,5,2,3};

    private LetterResult[] result = new LetterResult[5];
    @FXML
    private VBox root = new VBox();

    private HBox h = new HBox();


    @FXML
    private TextField word = new TextField();
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
    private HBox word5= new HBox();
    @FXML
    private Label welcomeText;
    @FXML
    private TextField text1 = new TextField();
    @FXML
    private TextField text2 = new TextField();
    @FXML
    private TextField text3 = new TextField();
    @FXML
    private TextField text4 = new TextField();
    @FXML
    private TextField text5 = new TextField();
    @FXML
    private TextField text6 = new TextField();
    @FXML
    private TextField text7 = new TextField();
    @FXML
    private TextField text8 = new TextField();
    @FXML
    private TextField text9 = new TextField();
    @FXML
    private TextField text10 = new TextField();
    @FXML
    private TextField text11 = new TextField();
    @FXML
    private TextField text12 = new TextField();
    @FXML
    private TextField text13 = new TextField();
    @FXML
    private TextField text14 = new TextField();
    @FXML
    private TextField text15 = new TextField();
    @FXML
    private TextField text16 = new TextField();
    @FXML
    private TextField text17 = new TextField();
    @FXML
    private TextField text18 = new TextField();
    @FXML
    private TextField text19 = new TextField();
    @FXML
    private TextField text20 = new TextField();
    @FXML
    private TextField text21 = new TextField();
    @FXML
    private TextField text22 = new TextField();
    @FXML
    private TextField text23 = new TextField();
    @FXML
    private TextField text24 = new TextField();
    @FXML
    private TextField text25 = new TextField();
    @FXML
    private TextField text26 = new TextField();
    @FXML
    private TextField text27 = new TextField();
    @FXML
    private TextField text28 = new TextField();
    @FXML
    private TextField text29 = new TextField();
    @FXML
    private TextField text30 = new TextField();
    @FXML
    private Label message = new Label();
    private Label winorlose = new Label();


    @FXML
    protected void onHelloButtonClick() {
        String guess = word.getText();
    }

    @FXML
    protected void onButtonPressed(KeyEvent event){
        message.setVisible(false);
        if(event.getCode().isLetterKey()){
            //System.out.println(event.getCode() + " " + root.getChildren().get(1));
            h = (HBox) root.getChildren().get(hindex);
            word = (TextField) h.getChildren().get(tindex);
            word.setText(event.getText());
            if(tindex < 4)
                tindex++;
            word.requestFocus();
            word.clear();
        }
        if(event.getCode().equals(KeyCode.BACK_SPACE)){
            //System.out.println(event.getCode() + " Back");
            h = (HBox) root.getChildren().get(hindex);
                word = (TextField) h.getChildren().get(tindex);
                word.clear();
            if(tindex > 0){
                tindex--;
                word = (TextField) h.getChildren().get(tindex);
            }
            word.requestFocus();
        }
        if(event.getCode().equals(KeyCode.ENTER)){
            h = (HBox) root.getChildren().get(hindex);
            if(tindex == 4) {
                for (int i = 0; i < h.getChildren().size(); i++) {
                    word = (TextField) h.getChildren().get(i);
                    line_word += word.getText();
                }
                try {
                    LetterResult[] result = game.submitGuess(line_word);
                    for (int i = 0; i < h.getChildren().size(); i++) {
                        word = (TextField) h.getChildren().get(i);
                        word.setStyle("-fx-text-fill: white");
                        word.setBackground(new Background(new BackgroundFill(getColor(result[i]), CornerRadii.EMPTY, Insets.EMPTY)));
                        word.setDisable(true);
                        //
                    }
                    gameOver();
                    hindex++;
                    tindex = 0;
                    h = (HBox) root.getChildren().get(hindex);
                    word = (TextField) h.getChildren().get(tindex);
                    word.requestFocus();
                    word.clear();
                } catch (IllegalWordException e) {
                    message.setText(e.getMessage());
                    message.setVisible(true);
                }
            }
            line_word = "";
        }
    }

    @FXML
    protected void gameOver(){
        if(game.isGameOver()){
            playAgain.setVisible(true);
            yesButton.setVisible(true);
            noButton.setVisible(true);
            text1.setDisable(true);
            text2.setDisable(true);
            text3.setDisable(true);
            text4.setDisable(true);
            text5.setDisable(true);
            text6.setDisable(true);
            text7.setDisable(true);
            text8.setDisable(true);
            text9.setDisable(true);
            text10.setDisable(true);
            text11.setDisable(true);
            text12.setDisable(true);
            text13.setDisable(true);
            text14.setDisable(true);
            text15.setDisable(true);
            text16.setDisable(true);
            text17.setDisable(true);
            text18.setDisable(true);
            text19.setDisable(true);
            text20.setDisable(true);
            text21.setDisable(true);
            text22.setDisable(true);
            text23.setDisable(true);
            text24.setDisable(true);
            text25.setDisable(true);
            text26.setDisable(true);
            text27.setDisable(true);
            text28.setDisable(true);
            text29.setDisable(true);
            text30.setDisable(true);
            root.requestFocus();
            if(game.isWin()){
                message.setText("You Win!");
                message.setVisible(true);
            }

            if (game.isLoss()){
                message.setText("You Lose! The word was " + game.getAnswer() + ".");
                message.setVisible(true);
            }
        }
    }

    protected void resetTextFields(){
        text1.clear();
        text2.clear();
        text3.clear();
        text4.clear();
        text5.clear();
        text6.clear();
        text7.clear();
        text8.clear();
        text9.clear();
        text10.clear();
        text11.clear();
        text12.clear();
        text13.clear();
        text14.clear();
        text15.clear();
        text16.clear();
        text17.clear();
        text18.clear();
        text19.clear();
        text20.clear();
        text21.clear();
        text22.clear();
        text23.clear();
        text24.clear();
        text25.clear();
        text26.clear();
        text27.clear();
        text28.clear();
        text29.clear();
        text30.clear();
    }

    protected void resetBackgroundColors(){
        text1.setStyle("-fx-background-color: white; -fx-border-color: black");
        text2.setStyle("-fx-background-color: white; -fx-border-color: black");
        text3.setStyle("-fx-background-color: white; -fx-border-color: black");
        text4.setStyle("-fx-background-color: white; -fx-border-color: black");
        text5.setStyle("-fx-background-color: white; -fx-border-color: black");
        text6.setStyle("-fx-background-color: white; -fx-border-color: black");
        text7.setStyle("-fx-background-color: white; -fx-border-color: black");
        text8.setStyle("-fx-background-color: white; -fx-border-color: black");
        text9.setStyle("-fx-background-color: white; -fx-border-color: black");
        text10.setStyle("-fx-background-color: white; -fx-border-color: black");
        text11.setStyle("-fx-background-color: white; -fx-border-color: black");
        text12.setStyle("-fx-background-color: white; -fx-border-color: black");
        text13.setStyle("-fx-background-color: white; -fx-border-color: black");
        text14.setStyle("-fx-background-color: white; -fx-border-color: black");
        text15.setStyle("-fx-background-color: white; -fx-border-color: black");
        text16.setStyle("-fx-background-color: white; -fx-border-color: black");
        text17.setStyle("-fx-background-color: white; -fx-border-color: black");
        text18.setStyle("-fx-background-color: white; -fx-border-color: black");
        text19.setStyle("-fx-background-color: white; -fx-border-color: black");
        text20.setStyle("-fx-background-color: white; -fx-border-color: black");
        text21.setStyle("-fx-background-color: white; -fx-border-color: black");
        text22.setStyle("-fx-background-color: white; -fx-border-color: black");
        text23.setStyle("-fx-background-color: white; -fx-border-color: black");
        text24.setStyle("-fx-background-color: white; -fx-border-color: black");
        text25.setStyle("-fx-background-color: white; -fx-border-color: black");
        text26.setStyle("-fx-background-color: white; -fx-border-color: black");
        text27.setStyle("-fx-background-color: white; -fx-border-color: black");
        text28.setStyle("-fx-background-color: white; -fx-border-color: black");
        text29.setStyle("-fx-background-color: white; -fx-border-color: black");
        text30.setStyle("-fx-background-color: white; -fx-border-color: black");
    }

    @FXML
    public void ChangeWordColor(){
        for(int i = 1; i < 6; i ++){
            h = (HBox) root.getChildren().get(i);
            for(int j = 0; j < 5; j++){
                word = (TextField)  h.getChildren().get(j);
                word.setStyle("-fx-text-fill: black");
            }
        }
    }
    @FXML
    protected void handleYesButton() {
        game = new WordleImplementation();
        resetTextFields();
        resetBackgroundColors();
        playAgain.setVisible(false);
        noButton.setVisible(false);
        yesButton.setVisible(false);
        message.setText("");
        reEnable();
        //ChangeWordColor(); don't need
        hindex = 1;
        tindex = 0;
        HBox h = (HBox) root.getChildren().get(hindex);
        TextField word = (TextField) h.getChildren().get(tindex);
        word.requestFocus();

    }
    @FXML
    protected void reEnable(){
        text1.setDisable(false);
        text2.setDisable(false);
        text3.setDisable(false);
        text4.setDisable(false);
        text5.setDisable(false);
        text6.setDisable(false);
        text7.setDisable(false);
        text8.setDisable(false);
        text9.setDisable(false);
        text10.setDisable(false);
        text11.setDisable(false);
        text12.setDisable(false);
        text13.setDisable(false);
        text14.setDisable(false);
        text15.setDisable(false);
        text16.setDisable(false);
        text17.setDisable(false);
        text18.setDisable(false);
        text19.setDisable(false);
        text20.setDisable(false);
        text21.setDisable(false);
        text22.setDisable(false);
        text23.setDisable(false);
        text24.setDisable(false);
        text25.setDisable(false);
        text26.setDisable(false);
        text27.setDisable(false);
        text28.setDisable(false);
        text29.setDisable(false);
        text30.setDisable(false);
        root.requestFocus();
    }
    @FXML
    protected void handleNoButton() {
        Platform.exit();
    }

    protected Color getColor(LetterResult lr) {
        Color green = rgb(0,255,0);
        Color gray = rgb(128,128,128);
        Color yellow = rgb(204,204,0);
        if(lr.equals(LetterResult.GRAY))
            return gray;
        if(lr.equals(LetterResult.YELLOW))
            return yellow;
        else
            return green;
    }
}






