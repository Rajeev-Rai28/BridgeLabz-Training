package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Instructor {
    String instructorName;
    ArrayList<Subject> subjects;

    Instructor(String instructorName) {
        this.instructorName = instructorName;
        subjects = new ArrayList<>();
    }

    void addSubject(Subject subject) {
        subjects.add(subject);
    }

    void viewSubjects() {
        System.out.println(instructorName + " teaches:");
        for (Subject s : subjects) {
            System.out.println("- " + s.subjectName);
        }
        System.out.println();
    }
}

