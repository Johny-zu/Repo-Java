module com.inicial.comiencofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.inicial.comiencofx to javafx.fxml;
    exports com.inicial.comiencofx;
}