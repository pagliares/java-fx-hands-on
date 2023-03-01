module com.example.firstjavafxapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstjavafxapplication to javafx.fxml;
    exports com.example.firstjavafxapplication;
}