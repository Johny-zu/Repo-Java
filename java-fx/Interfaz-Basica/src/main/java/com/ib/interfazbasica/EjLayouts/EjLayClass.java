package com.ib.interfazbasica.EjLayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EjLayClass extends Application {
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Boton 1");
        Button btn2 = new Button("Boton 2");
        Button btn3 = new Button("Boton 3");
        Button btn4 = new Button("Boton 4");
        Button btn5 = new Button("Boton 5");
        Button btn6 = new Button("Boton 6");

        GridPane root = new GridPane();
        //Fila 0
        GridPane.setColumnIndex(btn1, 0);
        GridPane.setRowIndex(btn1, 0);
        GridPane.setRowSpan(btn1, 2);
        btn1.setMaxHeight(Double.MAX_VALUE);
        GridPane.setConstraints(btn2, 1, 0, 2, 1);
        btn2.setMaxWidth(Double.MAX_VALUE);
        GridPane.setConstraints(btn3, 2, 0);

        //Fila 1
        GridPane.setConstraints(btn4, 0, 1);
        GridPane.setConstraints(btn5, 1, 1);
        GridPane.setConstraints(btn6, 2, 1);

        root.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Clase de ejercico lay");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
