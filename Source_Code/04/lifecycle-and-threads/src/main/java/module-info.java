module com.example.lifecycleandthreads {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lifecycleandthreads to javafx.fxml;
    exports com.example.lifecycleandthreads;
}