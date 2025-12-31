package com.objectModelingAndDiagram.objectModeling;

public class Faculty {
    String facultyName;
    String subject;

    Faculty(String facultyName, String subject) {
        this.facultyName = facultyName;
        this.subject = subject;
    }

    void displayFaculty() {
        System.out.println("Faculty: " + facultyName + ", Subject: " + subject);
    }
}

