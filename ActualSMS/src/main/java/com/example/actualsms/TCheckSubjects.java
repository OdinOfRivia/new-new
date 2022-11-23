package com.example.actualsms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TCheckSubjects {

    @FXML
    void addSubjectBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tAddSubjects.fxml");
    }

    @FXML
    void backBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("TeacherMain.fxml");
    }

    @FXML
    void setAbsenseBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tSetAbsence.fxml");
    }

    @FXML
    void setGradeBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tSetGrade.fxml");

    }

}
