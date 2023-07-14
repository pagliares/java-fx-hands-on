package org.example.readonlyproperties;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Constant constant = new Constant(500);
        constant.changeConstant(1000);
        System.out.println("Read only integer property: " + constant.getReadOnlyIntegerProperty().get());
    }

    public static void main(String[] args) {
        launch();
    }
}
