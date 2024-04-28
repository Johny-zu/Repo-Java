module com.ib.interfazbasica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ib.BorderPane to javafx.fxml;
    exports com.ib.BorderPane;
}