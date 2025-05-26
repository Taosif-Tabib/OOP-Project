
package com.mycompany.studentgradingsystem;

public class GradeManager {
    
        public void assignGrade(Student student, Course course, double grade) {
        student.addCourse(course, grade);
        System.out.println("Assigned Grade: " + grade + " for " + course.getName() + " to student " + student.getName());
    }
    
}
