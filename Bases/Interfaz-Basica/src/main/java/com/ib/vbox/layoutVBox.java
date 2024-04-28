package com.ib.vbox;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class layoutVBox {

    public void start(Stage primaryStage){


        VBox root = new VBox();
        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("VBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
