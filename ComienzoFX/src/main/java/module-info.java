module com.inicial.comienzofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.inicial.comienzofx to javafx.fxml;
    exports com.inicial.comienzofx;
}