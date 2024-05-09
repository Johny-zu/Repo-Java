package com.isb.ComponentesGUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorGUI implements Initializable {
    @FXML
    private Label lblNombre;

    public void initialize(URL url, ResourceBundle rb) {
        lblNombre.setText(lblNombre.getText());
    }
}
