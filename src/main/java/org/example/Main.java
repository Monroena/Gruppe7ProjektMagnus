package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Locale;

public class Main extends Application {

    private static Stage loginStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        loginStage=primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException{
        fxml = fxml.toLowerCase(Locale.ROOT);
 
        Parent pane=FXMLLoader.load(getClass().getResource(fxml));


        loginStage.getScene().setRoot(pane);

    }

    public static void main(String[] args) {

        launch(args);

    }
}
