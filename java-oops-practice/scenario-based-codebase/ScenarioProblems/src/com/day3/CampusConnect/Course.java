package com.day3.CampusConnect;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private Faculty faculty;
    private List<Student> students = new ArrayList<>();

    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void removeStudent(Student student) {
        students.remove(student);
    }
}
