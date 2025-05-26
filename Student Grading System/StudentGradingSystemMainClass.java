
package com.mycompany.studentgradingsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradingSystemMainClass {
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Grading System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Assign Grade");
            System.out.println("4. Calculate GPA");
            System.out.println("5. View Student Records");
            System.out.println("6. Search for Student");
            System.out.println("7. Search for Course");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    students.add(new Student(id, name));
                    System.out.println("Student Added Successfully!");
                    break;
                case 2:
                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter Course Code: ");
                    String code = scanner.nextLine();
                    System.out.print("Enter Credits: ");
                    int credits = scanner.nextInt();
                    courses.add(new Course(courseName, code, credits));
                    System.out.println("Course Added Successfully!");
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Course Code: ");
                    code = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine();
                    Student student = students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
                    Course course = courses.stream().filter(c -> c.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
                    if (student != null && course != null) {
                        new GradeManager().assignGrade(student, course, grade);
                    } else {
                        System.out.println("Student or Course not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    student = students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
                    if (student != null) {
                        System.out.println("GPA: " + new GPA().calculateGPA(student.getGrades(), student.getCourses()));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Student ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    student = students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
                    if (student != null) {
                        new RecordManager().viewStudentRecords(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Student ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    new SearchManager().searchStudent(students, id);
                    break;
                case 7:
                    System.out.print("Enter Course Code: ");
                    code = scanner.nextLine();
                    new SearchManager().searchCourse(courses, code);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
