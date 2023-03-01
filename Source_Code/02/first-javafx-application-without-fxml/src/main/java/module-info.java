module com.example.firstjavafxapplicationwithoutfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstjavafxapplicationwithoutfxml to javafx.fxml;
    exports com.example.firstjavafxapplicationwithoutfxml;
}