module org.example.bindingsexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.bindingsexample to javafx.fxml;
    exports org.example.bindingsexample;
}