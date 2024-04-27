package com.comienzo.comienzo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public HelloApplication(){
        System.out.println("Metodo constructor");
    }

    @Override
    public void init(){
        System.out.println("Metodo init");
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void Stop(){
        System.out.println("Metodo Stop");
        //Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}