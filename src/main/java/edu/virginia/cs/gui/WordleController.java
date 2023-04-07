package edu.virginia.cs.gui;

import edu.virginia.cs.wordle.GuessResult;
import edu.virginia.cs.wordle.LetterResult;
import edu.virginia.cs.wordle.WordleImplementation;
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

public class WordleController {
    WordleImplementation wordle = new WordleImplementation();
    GuessResult result = new GuessResult();
    @FXML
    public Label playAgain = new Label();
    @FXML
    private Button checkButton = new Button();
    public Button yesButton = new Button();
    public Button noButton = new Button();

    private int hindex = 1;

    private int tindex = 0;

    private String[] line_word = new String[5];

    private int[] arr = new int[]{6,1,5,2,3};
    @FXML
    private VBox root = new VBox();


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
    private Label message = new Label();



    @FXML
    protected void onHelloButtonClick() {
        String guess = word.getText();
        LetterResult[] answer = wordle.submitGuess(guess);
        HBox hbox = (HBox) root.getChildren().get(hindex);
        for(int i = 0; i < answer.length; i++){
            TextField text =(TextField).getChildren.get(i);
            if(answer[i].equals(LetterResult.GREEN)){
                text.setStyle("text-area-background: green;");
            }
           else if(answer[i].equals(LetterResult.YELLOW)){
                text.setStyle("text-area-background: yellow;");
            }
            else{
                text.setStyle("text-area-background: grey;");
            }
        }
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
            if(wordle.isWin()){
                message.setText("you win");
            }
            else{
                message.setText("you lose");
            }

        }
    }

    @FXML
    protected void handleYesButton() {
    }

    @FXML
    protected void handleNoButton() {

    }}




