package com.example.actualsms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class StudentMain {

    @FXML
    void CheckSubjectsBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("CheckSubjects.fxml");
    }

    @FXML
    void LogOut_BTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("hello-view.fxml");
    }

    @FXML
    void StudentInfoBTN(ActionEvent event) throws IOException {
            HelloApplication m = new HelloApplication();
            m.changeScene("StudentInfo.fxml");
    }

    @FXML
    void teacherBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("TeacherMain.fxml");
    }

}
