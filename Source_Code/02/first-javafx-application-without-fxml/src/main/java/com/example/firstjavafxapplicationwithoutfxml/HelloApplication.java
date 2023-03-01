package com.example.firstjavafxapplicationwithoutfxml;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    // If you want, you can remove the throws Exception from the method signature
    // since we are not going in this example open a file, such as a fxml file.
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setSpacing(20);

        Label text = new Label("");

        Button button = new Button("Click Me!");
        button.setOnAction(e -> text.setText("Welcome to Java FX Application without using FXML (not recommended)"));

        root.getChildren().addAll(text, button);

        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.setTitle("Hello");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}