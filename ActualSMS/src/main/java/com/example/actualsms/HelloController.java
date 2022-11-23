package com.example.actualsms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;


public class HelloController {

    @FXML
    private PasswordField Password;

    @FXML
    private TextField  Username;

    @FXML
    private CheckBox IsTeacher;


    @FXML
    void LogInBTN(ActionEvent event) throws IOException, SQLException {
        DatabaseConnection conn = new DatabaseConnection();
        HelloApplication m = new HelloApplication();
        boolean loggedIn = false;

        if(conn.Login(Username.getText(), Password.getText(), IsTeacher.isSelected())){
            loggedIn = true;


        }

        if(IsTeacher.isSelected() && loggedIn){
            m.changeScene("TeacherMain.fxml");
        }

        if(!IsTeacher.isSelected() && loggedIn){
            m.changeScene("StudentMain.fxml");
        }

    }





}

