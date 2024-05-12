package com.isb.ComponentesGUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ControladorGUI implements Initializable {
    @FXML
    private Button btn4;

    @FXML
    private Label menBTN;

    @FXML
    private void eventButton(ActionEvent event){
        JOptionPane.showMessageDialog(null, "Mensaje de boton");
    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}
