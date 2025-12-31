package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Student {
    String studentName;
    ArrayList<Course> courses;

    Student(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);   // Association (bi-directional)
    }

    void viewCourses() {
        System.out.println(studentName + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
        System.out.println();
    }
}

