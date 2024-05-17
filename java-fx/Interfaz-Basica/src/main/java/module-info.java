module com.ib.interfazbasica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ib.interfazbasica.BorderPane to javafx.fxml;
    exports com.ib.interfazbasica.BorderPane;
    exports com.ib.interfazbasica.VHbox;
    exports com.ib.interfazbasica.flowpaneclass;
    exports com.ib.interfazbasica.EjLayouts;
    exports com.ib.interfazbasica.Calculadora;
}