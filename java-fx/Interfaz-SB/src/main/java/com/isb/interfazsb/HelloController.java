package com.isb.interfazsb;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    private Label welcomeText;

    @FXML
    private Button button;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bienvenido a la primera practica!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        welcomeText.setText("Primer mensaje usando la GUI");
        button.setText("Pulsame");
    }
}