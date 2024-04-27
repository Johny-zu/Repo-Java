module com.comienzo.comienzo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.comienzo.comienzo to javafx.fxml;
    exports com.comienzo.comienzo;
}