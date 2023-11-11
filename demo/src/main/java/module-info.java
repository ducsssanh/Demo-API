module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires google.cloud.translate;
    requires com.google.auth.oauth2;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}