package com.ib.interfazbasica.flowpaneclass;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ClassFlowPane extends Application {
    public void start(Stage primaryStage) {

        Button btn[] = new Button[15];
        FlowPane root = new FlowPane();
        root.setOrientation(Orientation.VERTICAL);
        root.setHgap(10);
        root.setVgap(10);

        for(int i = 0; i < btn.length; i++){
            btn[i] = new Button("Boton " + (i+1));
            root.getChildren().add(btn[i]);
        }

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Clase FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}