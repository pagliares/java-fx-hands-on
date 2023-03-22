module org.example.propertiesandbindings {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.properties.bindings to javafx.fxml;
    exports org.example.properties.bindings;
}