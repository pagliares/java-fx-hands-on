module com.example.javafxapplicationlifecycle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxapplicationlifecycle to javafx.fxml;
    exports com.example.javafxapplicationlifecycle;
}