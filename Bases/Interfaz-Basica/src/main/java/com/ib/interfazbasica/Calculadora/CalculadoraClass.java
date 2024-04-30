package com.ib.interfazbasica.Calculadora;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CalculadoraClass extends Application {
    public void addPrefDimensionButton(Button btn, int width, int height){
        btn.setPrefWidth(width);
        btn.setPrefHeight(height);
    }

    public void addMaxfDimens(Button btn) {
        btn.setPrefWidth(Double.MAX_VALUE);
        btn.setPrefHeight(Double.MAX_VALUE);
    }

    @Override
    public void start(Stage primaryStage) {
        //Botones de calculadora
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

        //Botones operaciones
        Button btnSuma = new Button("+");
        Button btnResta = new Button("-");
        Button btnMultiplicacion = new Button("*");
        Button btnDivision = new Button("/");

        Button btnIgual = new Button("=");
        Button btnBorrar = new Button("C");

        //Capo de texto
        TextField txtOperaciones = new TextField();
        GridPane grid = new GridPane();

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);

        grid.getChildren().addAll(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
                btnSuma, btnResta, btnMultiplicacion, btnDivision, btnIgual, btnBorrar);
        StackPane.setMargin(grid, new Insets(10));
        StackPane root = new StackPane(grid);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}