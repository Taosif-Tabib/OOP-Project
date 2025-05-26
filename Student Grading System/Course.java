
package com.mycompany.studentgradingsystem;

public class Course {
    
        private String name;
    private String code;
    private int credits;

    public Course(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public String getName() { return name; }
    public String getCode() { return code; }
    public int getCredits() { return credits; }
  
}
