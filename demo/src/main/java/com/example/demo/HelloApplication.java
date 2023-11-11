package com.example.demo;

import Model.Translator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    static String credentialsPath = "/Users/mac/Desktop/UET/OOP/demo/src/main/resources/testapi-402514-dad2852e7b28.json";
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
            stage.setTitle("Translate application");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Translator translator = new Translator(credentialsPath);

        String textToTranslate = "Hello, world!";
        String targetLanguage = "vi"; //

        String translatedText = translator.translateText(textToTranslate, targetLanguage);

        System.out.println(translatedText);
        launch();
    }
}