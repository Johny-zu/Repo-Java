package com.isb.ComponentesGUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ControladorGUI implements Initializable {
    @FXML
    private Button btn4;

    @FXML
    private Label menBTN;

    @FXML
    private TextField txt1, txt2, txt3, txt4;

    @FXML
    private void eventKey(KeyEvent event){
        Object evt = event.getSource();
        if (evt.equals(txt1)){
            if(! Character.isLetter(event.getCharacter().charAt(0)))
                event.consume();
        } else if(evt.equals(txt2)) {
            if(! Character.isDigit(event.getCharacter().charAt(0)))
                event.consume();
        }else if(evt.equals(txt3)) {
            if(! Character.isDigit(event.getCharacter().charAt(0)) && ! Character.isLetter(event.getCharacter().charAt(0)))
                event.consume();
        }else if(evt.equals(txt4)) {
            if (txt4.getText().length() < 9)
                event.consume();
        }else
            System.out.print("Algo anda fallando");
    }

    @FXML
    private void eventButton(ActionEvent event){
        JOptionPane.showMessageDialog(null, "Mensaje de boton");
    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}
