package com.example.actualsms;

import java.util.Stack;

public class Teacher {
    public int id;
    public String fn;
    public String ln;
    public int age;
    public String email;
    public String phone;
    public String Country;
    public static  int numTeacher;
    public Stack<Object> Classes;
    public String password;

    public Teacher(int id, String fn, String ln, int age, String email, String phone, String country, String password) {
        this.id=id;
        this.id = id;
        this.fn = fn;
        this.ln=ln;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.password=password;
        Country = country;
        numTeacher=numTeacher+1;
        Stack<Object> stack23 = new Stack<Object>();
        Classes=stack23;

    }






    public void addClasses(Object e){
        Classes.add(e);

    }
}
