module com.example.nine {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.nine to javafx.fxml;
    exports com.example.nine;
}