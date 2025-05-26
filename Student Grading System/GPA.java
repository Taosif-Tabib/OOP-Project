
package com.mycompany.studentgradingsystem;

import java.util.ArrayList;

public class GPA {
    
        public double calculateGPA(ArrayList<Double> grades, ArrayList<Course> courses) {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < grades.size(); i++) {
            totalPoints += grades.get(i) * courses.get(i).getCredits();
            totalCredits += courses.get(i).getCredits();
        }

        return totalCredits > 0 ? totalPoints / totalCredits : 0;
    }
    
}
