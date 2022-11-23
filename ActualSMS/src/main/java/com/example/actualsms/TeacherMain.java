package com.example.actualsms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TeacherMain {

    @FXML
    void checkStudentsBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tStudentMenu.fxml");
    }

    @FXML
    void checkSubjectsBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tCheckSubjects.fxml");
    }

    @FXML
    void logOutBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("hello-view.fxml");
    }

    @FXML
    void studentMenuBTN(ActionEvent event) throws IOException {
            HelloApplication m = new HelloApplication();
            m.changeScene("StudentMain.fxml");
    }

}
