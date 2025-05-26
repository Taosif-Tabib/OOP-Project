
package com.mycompany.studentgradingsystem;

import java.util.ArrayList;

public class SearchManager {
    
    public void searchStudent(ArrayList<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student Found: " + student.getName());
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void searchCourse(ArrayList<Course> courses, String code) {
        for (Course course : courses) {
            if (course.getCode().equalsIgnoreCase(code)) {
                System.out.println("Course Found: " + course.getName());
                return;
            }
        }
        System.out.println("Course not found.");
    }
    
}
