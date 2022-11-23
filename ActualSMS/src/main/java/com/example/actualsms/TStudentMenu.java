package com.example.actualsms;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class TStudentMenu {

    @FXML
    private TableColumn<Student,Integer> age=new TableColumn<Student, Integer>();
    @FXML
    private TableColumn<Student,Integer> id=new TableColumn<Student, Integer>();

    @FXML
    private TableColumn<Student, String> country=new TableColumn<Student, String>();

    @FXML
    private TableColumn<Student, String> phoneNumber=new TableColumn<Student, String>();

    @FXML
    private TableColumn<Student, String> email=new TableColumn<Student, String>();

    @FXML
    private TableColumn<Student, String> firstName=new TableColumn<Student, String>();

    @FXML
    private TableColumn<Student, String> lastName=new TableColumn<Student, String>();

    @FXML
    private TableColumn<Student, String> password=new TableColumn<Student, String>();

    @FXML
    private TableView<Student> tableID=new TableView<Student>();


    @FXML
    void addStudentBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tAddStudent.fxml");
    }

    @FXML
    void backBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("TeacherMain.fxml");
    }

    @FXML
    void edditStudentBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tEdditStudent.fxml");
    }

    private String DatabaseConnectionString = "jdbc:sqlite:applicationDb.db";
    private String query ="SELECT * FROM Students";
    private Connection conn = null;
    public static ResultSet rs;
    private static ObservableList<Student> studentList;


    private void handleDisplayTables() throws NullPointerException {
        try {

            PreparedStatement statement = conn.prepareStatement(query);
            rs = statement.executeQuery();
            studentList = FXCollections.observableArrayList();

            while (rs.next()) {
                //        studentList.add(new Student(Integer.parseInt(rs.getString("Email")), rs.getInt("StudentID"),
                //        rs.getString("Country"), rs.getString("age"), rs.getString("Password"),
                //        rs.getString("PhoneNumber"), rs.getString("FirstName"), rs.getString("LastName")));

                int age = rs.getInt("age");
                int StudentID = rs.getInt("StudentID");
                String country = rs.getString("Country");
                String email = rs.getString("Email");
                String password = rs.getString("Password");
                String phone = rs.getString("PhoneNumber");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");

                studentList.add(new Student(StudentID,firstName,lastName,age,email,phone,country,password));
                System.out.println(country);


            }
        } catch (Exception e) {
            System.out.println(e);
        }



        age.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((Student)cellData.getValue()).getAge()).asObject());});
        country.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((Student)cellData.getValue()).getCountry()));});
        email.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((Student)cellData.getValue()).getEmail()));});
        password.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((Student)cellData.getValue()).getPassword()));});
        firstName.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((Student)cellData.getValue()).getFn()));});
        lastName.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((Student)cellData.getValue()).getLn()));});
        phoneNumber.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((Student)cellData.getValue()).getPhone()));});
        id.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((Student)cellData.getValue()).getId())).asObject();});

        tableID.setItems(studentList);

        tableID.getColumns().addAll(firstName,lastName,age,email,phoneNumber,id,country);

        tableID.refresh();
    }

    public  void connect() {
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(DatabaseConnectionString);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public TStudentMenu() {
        connect();
        handleDisplayTables();
    }

}


