package com.example.lifecyclestop;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloApplication extends Application {

    @Override
    public void init() throws Exception {
        // What thread does init method belong? answer: JavaFX-Launcher thread
        System.out.println("init() method is on thread named..: "+ Thread.currentThread().getName());
    }

    @Override
    public void start(Stage stage) throws Exception {
        /** When the user clicks the x symbol in the Stage, the application closes visually, but it is still running
        Usually not changed to false, but it can be useful in some specific scenarios when, for instance,
        multiple windows are open at the same time
        Platform.setImplicitExit(false);
         **/
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setSpacing(20);

        Label text = new Label("");

        Button firstButton = new Button("Click Me!");
        firstButton.setOnAction(e -> text.setText("Learning JavaFX threads & lifecycle"));

        Button secondButton = new Button("Exit explicitly!");
        secondButton.setOnAction(event -> Platform.exit()); // Explicitly exits

        root.getChildren().addAll(text, firstButton, secondButton);

        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFX threads");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop() method is on thread named..: " + Thread.currentThread().getName());
        System.out.println("Closing the application");
    }

    public static void main(String[] args) {
        launch();
    }
}