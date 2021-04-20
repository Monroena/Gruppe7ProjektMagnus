package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage loginStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        loginStage=primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public void changeScene(String fmxl) throws IOException{
        Parent pane=FXMLLoader.load(getClass().getResource(fmxl));
        loginStage.getScene().setRoot(pane);
    }

    public static void main(String[] args) {

        launch(args);

    }
}
