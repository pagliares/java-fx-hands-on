package org.example.properties.bindings;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.text.NumberFormat;
import java.util.Locale;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Locale brazil = Locale.of("pt", "BR");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(brazil);

        VBox root = new VBox();
        Employee employee = new Employee("Atticus Finch", 25_000.00);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label = new Label("Name..: " + employee.getName() + "\nSalary..: " +
                formatter.format(employee.getSalary()));
        Button button = new Button("Increase the salary by 10%");
        button.setOnAction(e -> {
            double salary = employee.getSalary();
            employee.setSalary(salary * 1.10);
        });
        employee.getSalaryProperty().addListener(
                o -> label.setText("Name..: " + employee.getName() + "\nSalary..: " + formatter.format(employee.getSalary()))
        );
        root.getChildren().addAll(label, button);
        Scene scene = new Scene(root, 550, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
