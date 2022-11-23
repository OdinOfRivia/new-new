package com.example.actualsms;

import java.util.Stack;

public class Student {
    public int id;
    public String fn;
    public String ln;
    public int age;
    public String email;
    public String phone;
    public String Country;
    public static  int numStudent;
    public Stack<Object> Classes;
    public String password;


    public Student(int id, String fn, String ln, int age, String email, String phone, String country, String password) {
        this.id=id;
        this.fn = fn;
        this.ln=ln;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.password=password;
        Country = country;
        numStudent=numStudent+1;
        Stack<Object> stack23 = new Stack<Object>();
        Classes=stack23;
    }


    public void addClasses(Object e){
        Classes.add(e);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public static int getNumStudent() {
        return numStudent;
    }

    public static void setNumStudent(int numStudent) {
        Student.numStudent = numStudent;
    }

    public Stack<Object> getClasses() {
        return Classes;
    }

    public void setClasses(Stack<Object> classes) {
        Classes = classes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}