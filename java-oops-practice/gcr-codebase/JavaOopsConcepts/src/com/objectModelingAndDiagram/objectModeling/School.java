package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.studentName);
        }
        System.out.println();
    }
}

