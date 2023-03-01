package com.example.lifecycleandthreads;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

// To test this example, click the Block Me button first and then try to click the Click me button
public class HelloApplication extends Application {

    @Override
    public void init() throws Exception {
        // What thread does init method belong? answer: JavaFX-Launcher thread
        System.out.println("Thread name...: "+ Thread.currentThread().getName());
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setSpacing(20);

        Label text = new Label("");

        Button firstButton = new Button("Click Me!");
        firstButton.setOnAction(e -> text.setText("Learning JavaFX threads & lifecycle"));

        Button secondButton = new Button("Block me!");
        secondButton.setOnAction(event ->{
            System.out.println("GUI is blocked now");
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        root.getChildren().addAll(text, firstButton, secondButton);

        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFX threads");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}