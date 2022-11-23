package com.example.actualsms;

public class Subjects {
    public String name;
    public double grade;
    public double Absence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getAbsence() {
        return Absence;
    }

    public void setAbsence(double absence) {
        Absence = absence;
    }

    public Subjects(String name, double grade, double absence) {
        this.name = name;
        this.grade = grade;
        Absence = absence;
    }
}
