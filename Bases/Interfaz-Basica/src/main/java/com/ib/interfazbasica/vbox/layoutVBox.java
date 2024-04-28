package com.ib.interfazbasica.vbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class layoutVBox extends Application {

    public void start(Stage primaryStage){
        Label labelTitulo = new Label("Login");
        labelTitulo.setFont(new Font(30));

        Label labelUser = new Label("Usuario");
        labelUser.setFont(new Font(15));

        Label labelPass = new Label("Contraseña");
        labelPass.setFont(new Font(15));

        TextField txtUser = new TextField();
        txtUser.setMaxWidth(150);

        PasswordField txtPass = new PasswordField();
        txtPass.setMaxWidth(150);

        Button btnLogin = new Button("Entrar");
        btnLogin.setMaxWidth(150);
        btnLogin.setCursor(Cursor.HAND);

        VBox root = new VBox();

        root.getChildren().addAll(labelTitulo, labelUser, txtUser, labelPass, txtPass, btnLogin);
        root.setAlignment(Pos.CENTER);

        VBox.setMargin(labelUser, new Insets(10, 0, 0, 0));
        VBox.setMargin(labelPass, new Insets(10, 0, 0, 0));
        VBox.setMargin(btnLogin, new Insets(10, 0, 0, 0));

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("VBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
