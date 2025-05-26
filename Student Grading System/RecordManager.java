
package com.mycompany.studentgradingsystem;

public class RecordManager {
    
        public void viewStudentRecords(Student student) {
        System.out.println("Student ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        for (int i = 0; i < student.getCourses().size(); i++) {
            System.out.println("- " + student.getCourses().get(i).getName() + ": Grade " + student.getGrades().get(i));
        }
    }
    
}
