module com.example.lifecyclestop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lifecyclestop to javafx.fxml;
    exports com.example.lifecyclestop;
}