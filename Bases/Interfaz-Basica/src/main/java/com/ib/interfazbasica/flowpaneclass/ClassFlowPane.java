package com.ib.interfazbasica.flowpaneclass;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ClassFlowPane extends Application {
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Clase FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
