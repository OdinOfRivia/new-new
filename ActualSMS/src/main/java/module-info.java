module com.example.actualsms {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.actualsms to javafx.fxml;
    exports com.example.actualsms;
}