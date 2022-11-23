package com.example.actualsms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TSetGrade {

    @FXML
    void backBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tCheckSubjects.fxml");
    }

}
