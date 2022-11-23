package com.example.actualsms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Mega {

    public  Stack<Object> Student;
    public  Queue<Object> Teachers;
    public  ArrayList<Object> Classes;
    public  ArrayList<Double> Usernames;
    public  ArrayList<String> Passwords;

    public Mega() {
        Stack<Object> stack1 = new Stack<Object>();
        this.Student=stack1;
        ArrayList<Object> pq2 =new ArrayList<>();
        ArrayList<Double> pq3 =new ArrayList<>();
        ArrayList<String> pq4 =new ArrayList<>();
        Queue<Object> q= new LinkedList<>();
        this.Teachers=q;
        this.Classes=pq2;
        this.Usernames=pq3;
        this.Passwords=pq4;
    }

    public void addStudent(Object e){
        Student.add(e);
    }
    public void deleteStudent(Object e){
        Student.remove(e);

    }
    public void addTeachers(Object e){
        Teachers.add(e);
    }
    public void deleteTeachers(Object e){
        Teachers.remove(e);

    }
    public void addClass(Object e){
        Classes.add(e);

    }
    public void deleteClass(Object Class){
        Classes.remove(Class);

    }
    public void addUser_name(double e){
        Usernames.add(e);

    }
    public void deleteUser_name(double Class){
        Usernames.remove(Class);

    }
    public void addPassword (String Class){
        Passwords.add(Class);

    }
    public void deletePassword (String Class){
        Passwords.remove(Class);

    }
    public void ContiansUsername(double Class){
        Usernames.contains(Class);
    }
    public void ContiansPassword(double Class){
        Usernames.contains(Class);
    }


}






