module com.ib.interfazbasica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ib.interfazbasica.BorderPane to javafx.fxml;
    exports com.ib.interfazbasica.BorderPane;
    exports com.ib.interfazbasica.vbox;
}