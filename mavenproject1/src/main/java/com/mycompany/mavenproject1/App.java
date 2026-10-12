package com.mycompany.mavenproject1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        var label = new Label();
        var button = new Button("Show Info");
        button.setOnAction((ActionEvent event) -> {
            label.setText("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        });
        var box = new VBox(10, label, button);
        box.setAlignment(Pos.CENTER);
        var scene = new Scene(new StackPane(box), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
