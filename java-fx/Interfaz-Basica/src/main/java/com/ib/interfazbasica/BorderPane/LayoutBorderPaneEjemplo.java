package com.ib.interfazbasica.BorderPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class LayoutBorderPaneEjemplo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");
        Button btn3 = new Button("Button3");
        Button btn4 = new Button("Button4");
        Button btn5 = new Button("Button5");

        BorderPane root = new BorderPane();

        root.setCenter(btn1);
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn1.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(btn1, new Insets(5, 5, 5, 5));

        root.setTop(btn2);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxHeight(Double.MAX_VALUE);

        root.setBottom(btn3);
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxHeight(Double.MAX_VALUE);

        root.setLeft(btn4);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(btn4, new Insets(5, 0, 5, 0));

        root.setRight(btn5);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxHeight(Double.MAX_VALUE);
        root.setMargin(btn5, new Insets(5, 0, 5, 0));

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("LayoutBorderPaneEjemplo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
