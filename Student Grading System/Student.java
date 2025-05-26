
package com.mycompany.studentgradingsystem;

import java.util.ArrayList;
import java.util.Scanner;


public class Student {
    
        private int id;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public ArrayList<Course> getCourses() { return courses; }
    public ArrayList<Double> getGrades() { return grades; }

    public void addCourse(Course course, double grade) {
        courses.add(course);
        grades.add(grade);
    }
    void addCourses(Course course, double grade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


