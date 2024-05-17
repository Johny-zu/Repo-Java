package com.ib.interfazbasica.VHbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.InputStream;

public class layoutVBox extends Application {

    public void start(Stage primaryStage){
        VBox bloqueIzquierdo = new VBox();
        Label labelTitulo = new Label("Iniciar sesión");
        labelTitulo.setFont(new Font(40));

        VBox bloqueLogin = new VBox();
        Label labelUser = new Label("Usuario");
        labelUser.setFont(new Font(20));

        Label labelPass = new Label("Contraseña");
        labelPass.setFont(new Font(20));

        TextField txtUser = new TextField();
        txtUser.setFont(new Font(18));
        txtUser.setPromptText("Ingresar usuario");
        txtUser.setPrefWidth(341);
        txtUser.setPrefHeight(44);

        PasswordField txtPass = new PasswordField();
        txtPass.setFont(new Font(18));
        txtPass.setPromptText("Ingresar contraseña");
        txtPass.setPrefWidth(341);
        txtPass.setPrefHeight(44);

        Button btnLogin = new Button("Entrar");
        btnLogin.setFont(new Font(20));
        btnLogin.setPrefWidth(370);
        btnLogin.setPrefHeight(44);
        btnLogin.setMaxWidth(Double.MAX_VALUE);
        btnLogin.setCursor(Cursor.HAND);

        bloqueLogin.getChildren().addAll(labelTitulo, labelUser, txtUser, labelPass, txtPass, btnLogin);
        bloqueLogin.setAlignment(Pos.TOP_LEFT);
        VBox.setMargin(labelUser, new Insets(10, 0, 0, 0));
        VBox.setMargin(labelPass, new Insets(10, 0, 0, 0));
        VBox.setMargin(btnLogin, new Insets(20, 0, 0, 0));

        bloqueIzquierdo.getChildren().addAll(labelTitulo, bloqueLogin);
        bloqueIzquierdo.setPrefWidth(422);
        bloqueIzquierdo.setAlignment(Pos.CENTER);
        VBox.setMargin(btnLogin, new Insets(20, 0, 0, 0));

        VBox.setMargin(bloqueLogin, new Insets(0, 30, 0, 30));

        VBox bloqueDerecho = new VBox();
        InputStream inputStream = getClass().getResourceAsStream("/com/ib/interfazbasica/vbox/nekoLap.jpg");
        if (inputStream != null) {
            Image image = new Image(inputStream);
            ImageView imgd = new ImageView(image);
            imgd.setPreserveRatio(false);
            imgd.setFitWidth(422);
            imgd.setFitHeight(503);
            bloqueDerecho.getChildren().addAll(imgd);
        } else {
            System.err.println("No se pudo cargar la imagen 'nekoLap.jpg'");
        }
        bloqueDerecho.setPrefWidth(422);
        bloqueDerecho.setAlignment(Pos.CENTER);
        bloqueDerecho.setBackground(
                new Background(
                        new BackgroundFill(
                                Color.web("#30373e"), CornerRadii.EMPTY, Insets.EMPTY)));

        HBox root = new HBox();
        root.getChildren().addAll(bloqueIzquierdo, bloqueDerecho);

        HBox.setHgrow(bloqueIzquierdo, Priority.ALWAYS);
        HBox.setHgrow(bloqueDerecho, Priority.ALWAYS);

        Scene scene = new Scene(root, 854, 503);
        primaryStage.setTitle("Hbox layout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
