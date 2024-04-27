module com.ib.interfazbasica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ib.interfazbasica to javafx.fxml;
    exports com.ib.interfazbasica;
}