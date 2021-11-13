package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainMenu extends Application {

    public void start(final Stage stage) {
        stage.setHeight(400);
        stage.setWidth(700);
        stage.setTitle("BUG");

        Scene scene = new Scene(new Group());
        BorderPane root = new BorderPane();

        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void run(final String[] args) {
        launch(args);
    }
}