package com.example.actualsms;
import java.sql.*;
import java.util.List;



// Create a database connection.

public class DatabaseConnection {
    private String DatabaseConnectionString = "jdbc:sqlite:applicationDb.db";

    private Connection conn = null;

    public DatabaseConnection() {
        connect();
    }

    public List<Student> GetAllStudents() {
        String sql = "SELECT * FROM Students;";
        return null;
    }


    public List<Teacher> GetAllTeachers() {
        String sql = "SELECT * FROM Teachers;";
        return null;
    }

    public void InsertStudent(Student student) {
        String sql = "INSERT INTO Students(StudentID, FirstName, LastName, Email, PhoneNumber, Country,  Password,age) VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, student.id);
            pstmt.setString(2, student.fn);
            pstmt.setString(3, student.ln);
            pstmt.setString(4, student.email);

            pstmt.setString(5, student.phone);


            pstmt.setString(6, student.Country);
            pstmt.setString(7, student.password);
            pstmt.setInt(8, student.age);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void InsertTeacher(Teacher teacher) {
        String sql = "INSERT INTO Teachers(TeacherID, FirstName, LastName, Email, PhoneNumber, Country,  Password,age) VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, teacher.id);
            pstmt.setString(2, teacher.fn);
            pstmt.setString(3, teacher.ln);
            pstmt.setString(4, teacher.email);

            pstmt.setString(5, teacher.phone);

            pstmt.setString(6, teacher.Country);
            pstmt.setString(7, teacher.password);
            pstmt.setInt(8, teacher.age);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean Login(String m, String inputPassword, boolean isTeacher) throws SQLException {
        try {

            String sql2 = "SELECT * from Teachers WHERE email='" + m + "' and Password='" + inputPassword+ "';";
            String sql3 = "SELECT * from Students WHERE email='" + m + "' and Password='" + inputPassword+ "';";

            System.out.println(String.format("Username %s with Password %s logging in...", m, inputPassword));
            System.out.println(String.format("Is Teacher?.. " +isTeacher));

            Statement stmt = conn.createStatement();
            ResultSet rs;

            if (isTeacher) {
                rs = stmt.executeQuery(sql2);
            } else {
                rs = stmt.executeQuery(sql3);
            }
            if (rs.next() == false) {
                System.out.println(String.format("Username %s with Password %s failed to login...", m, inputPassword));
                return false;
            }

            System.out.println(String.format("%s successfully logged in", m));
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
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
}
