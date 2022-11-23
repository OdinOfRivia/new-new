package com.example.actualsms;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.sql.Statement;

public class StudentInfo {

    @FXML
    private TableColumn<?, ?> age;

    @FXML
    private TableColumn<?, ?> country;

    @FXML
    private TableColumn<?, ?> email;

    @FXML
    private TableColumn<?, ?> firstName;

    @FXML
    private TableColumn<?, ?> id;

    @FXML
    private TableColumn<?, ?> lastName;

    @FXML
    private TableColumn<?, ?> number;

    @FXML
    private TableView<?> table;

    @FXML
    void BackBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("StudentMain.fxml");

    }
    void SetTable(){

        DatabaseConnection conn =new DatabaseConnection();
        table= (TableView<?>) conn.GetAllStudents();


    }

}
