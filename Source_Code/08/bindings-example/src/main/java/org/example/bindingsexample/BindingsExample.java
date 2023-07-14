package org.example.bindingsexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class BindingsExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox verticalBox = new VBox();
        verticalBox.setAlignment(Pos.CENTER);
        verticalBox.setSpacing(15);

        Label label = new Label("How to link the value typed with a label? Answer: bindings");
        TextField textField1 = new TextField();
        textField1.setMaxWidth(150);

        TextField textField2 = new TextField();
        textField2.setMaxWidth(150);

        Button button = new Button("Bindings example");
        // bind the label to the textfield1 when the button is clicked. Not binding before pressed.
        button.setOnAction(actionEvent -> label.textProperty().bind(textField1.textProperty()));


        // First way of doing binding (unidirectional). Remember to always bind thing of the same type. Here both has String Property type
        // textField1.textProperty().addListener((observer, oldValue, newValue) -> label.setText(newValue));

        // Second way of doing binding (unidirectional). Remember to always bind thing of the same type. Here both has String Property type
        // label.textProperty().bind(textField1.textProperty());

        // Third way of doing binding (bidirectional).
        textField1.textProperty().bindBidirectional(textField2.textProperty());

        // It is an error trying to manually change the value of a label after the biding
        // label.setText("Error. Cannot manually change value after binding");

        verticalBox.getChildren().addAll(label, textField1, textField2, button);
        Scene scene = new Scene(verticalBox, 400, 350);
        stage.setTitle("Bindings example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}