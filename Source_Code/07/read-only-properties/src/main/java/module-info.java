module org.example.readonlyproperties {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.readonlyproperties to javafx.fxml;
    exports org.example.readonlyproperties;
}