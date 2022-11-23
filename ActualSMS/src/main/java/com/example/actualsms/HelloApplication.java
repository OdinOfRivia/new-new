package com.example.actualsms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.actualsms.Teacher;
import com.example.actualsms.Student;
import com.example.actualsms.Mega;

import java.io.IOException;


public class HelloApplication extends Application {




    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {

        DatabaseConnection conn = new DatabaseConnection();
        //conn.InsertStudent(new Student(2, "Adding", "From", 5, "database@email", "phone", "uk", "password"));
       // conn.InsertTeacher(new Teacher(1, "Ding", "Dong", 5, "database@email", "phone", "uk",  "password"));


        stg = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void changeScene (String fmxl) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fmxl));
        stg.getScene().setRoot(pane);

    }


    public static void main(String[] args) {
        launch();
    }


}