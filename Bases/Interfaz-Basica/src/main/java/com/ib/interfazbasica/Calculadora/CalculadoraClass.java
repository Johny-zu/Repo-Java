package com.ib.interfazbasica.Calculadora;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CalculadoraClass extends Application {
    public void addPrefDimensionButton(Button btn, int width, int height){
        btn.setPrefWidth(width);
        btn.setPrefHeight(height);
    }

    public void addMaxfDimensButton(Button btn) {
        btn.setMaxWidth(Double.MAX_VALUE);
        btn.setMaxHeight(Double.MAX_VALUE);
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

        //Fila 0
        GridPane.setConstraints(txtOperaciones, 0, 0, 4, 1);

        //Fila 1
        GridPane.setConstraints(btn7, 0, 1);
        GridPane.setConstraints(btn8, 1, 1);
        GridPane.setConstraints(btn9, 2, 1);
        GridPane.setConstraints(btnSuma, 3, 1);

        //Fila 2
        GridPane.setConstraints(btn4, 0, 2);
        GridPane.setConstraints(btn5, 1, 2);
        GridPane.setConstraints(btn6, 2, 2);
        GridPane.setConstraints(btnResta, 3, 2);

        //Fila 3
        GridPane.setConstraints(btn1, 0, 3);
        GridPane.setConstraints(btn2, 1, 3);
        GridPane.setConstraints(btn3, 2, 3);
        GridPane.setConstraints(btnMultiplicacion, 3, 3);

        //Fila 4
        GridPane.setConstraints(btnBorrar, 0, 4);
        GridPane.setConstraints(btn0, 1, 4);
        GridPane.setConstraints(btnIgual, 2, 4);
        GridPane.setConstraints(btnDivision, 3, 4);

        //Textfield de op
        txtOperaciones.setMaxWidth(Double.MAX_VALUE);
        txtOperaciones.setMaxHeight(Double.MAX_VALUE);

        //Tamaño de botones
        addPrefDimensionButton(btn0, 55, 35);
        addPrefDimensionButton(btn1, 55, 35);
        addPrefDimensionButton(btn2, 55, 35);
        addPrefDimensionButton(btn3, 55, 35);
        addPrefDimensionButton(btn4, 55, 35);
        addPrefDimensionButton(btn5, 55, 35);
        addPrefDimensionButton(btn6, 55, 35);
        addPrefDimensionButton(btn7, 55, 35);
        addPrefDimensionButton(btn8, 55, 35);
        addPrefDimensionButton(btn9, 55, 35);

        addPrefDimensionButton(btnSuma, 55, 35);
        addPrefDimensionButton(btnResta, 55, 35);        addPrefDimensionButton(btn0, 55, 35);
        addPrefDimensionButton(btnMultiplicacion, 55, 35);
        addPrefDimensionButton(btnDivision, 55, 35);
        addPrefDimensionButton(btnBorrar, 55, 35);
        addPrefDimensionButton(btnIgual, 55, 35);

        //Division correcta
        GridPane.setVgrow(txtOperaciones, Priority.ALWAYS);
        GridPane.setVgrow(btn7, Priority.ALWAYS);
        GridPane.setVgrow(btn4, Priority.ALWAYS);
        GridPane.setVgrow(btn1, Priority.ALWAYS);
        GridPane.setVgrow(btnBorrar, Priority.ALWAYS);

        GridPane.setHgrow(btn7, Priority.ALWAYS);
        GridPane.setHgrow(btn8, Priority.ALWAYS);
        GridPane.setHgrow(btn9, Priority.ALWAYS);
        GridPane.setHgrow(btnSuma, Priority.ALWAYS);

        addMaxfDimensButton(btn0);
        addMaxfDimensButton(btn1);
        addMaxfDimensButton(btn2);
        addMaxfDimensButton(btn3);
        addMaxfDimensButton(btn4);
        addMaxfDimensButton(btn5);
        addMaxfDimensButton(btn6);
        addMaxfDimensButton(btn7);
        addMaxfDimensButton(btn8);
        addMaxfDimensButton(btn9);
        addMaxfDimensButton(btnSuma);
        addMaxfDimensButton(btnResta);
        addMaxfDimensButton(btnDivision);
        addMaxfDimensButton(btnMultiplicacion);
        addMaxfDimensButton(btnBorrar);
        addMaxfDimensButton(btnIgual);


        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);

        grid.getChildren().addAll(txtOperaciones, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
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