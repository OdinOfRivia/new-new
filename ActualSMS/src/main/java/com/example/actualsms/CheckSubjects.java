package com.example.actualsms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class CheckSubjects {

    @FXML
    void backBTN(ActionEvent event) throws IOException {

        HelloApplication n = new HelloApplication();
        n.changeScene("StudentMain.fxml");
    }

    @FXML
    void absenceBTN(ActionEvent event) throws IOException {
            HelloApplication m = new HelloApplication();
            m.changeScene("Absence.fxml");
    }


}
