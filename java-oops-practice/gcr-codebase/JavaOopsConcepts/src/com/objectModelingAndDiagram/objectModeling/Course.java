package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.studentName);
        }
        System.out.println();
    }
}

