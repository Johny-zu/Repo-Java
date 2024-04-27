module com.ley.claseleyouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ley.claseleyouts to javafx.fxml;
    exports com.ley.claseleyouts;
}