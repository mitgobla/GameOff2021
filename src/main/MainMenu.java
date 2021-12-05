package main;

import java.io.InputStream;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainMenu extends Application {

    public void start(final Stage stage) throws IOException{
        stage.setHeight(640);
        stage.setWidth(615);
        stage.setTitle("BUG");

        InputStream stream = new FileInputStream("src/main/images/galaxy1.png");
        Image image = new Image(stream);
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setX(10);
        imageView.setY(10);
        imageView.setFitWidth(575);
        imageView.setPreserveRatio(true);

        Group root = new Group(imageView);
        Scene scene = new Scene(root, 595, 370);
        stage.setScene(scene);
        stage.show();
    }

    public static void run(final String[] args) {
        launch(args);
    }
}