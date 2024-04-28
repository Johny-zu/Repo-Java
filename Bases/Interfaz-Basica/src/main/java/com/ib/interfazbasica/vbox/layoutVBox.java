package com.ib.interfazbasica.vbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class layoutVBox extends Application {

    public void start(Stage primaryStage){
        Label labelTitulo = new Label("Login");
        Label labelUser = new Label("Usuario");
        Label labelPass = new Label("Contraseña");

        TextField txtUser = new TextField();
        PasswordField txtPass = new PasswordField();

        Button btnLogin = new Button("Entrar");

        VBox root = new VBox();

        root.getChildren().addAll(labelTitulo, labelUser, labelPass, txtUser, txtPass, btnLogin);
        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("VBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
