package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class University {
    String universityName;
    ArrayList<AcademicDepartment> departments; // renamed
    ArrayList<Faculty> faculties;

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    // Composition: creates AcademicDepartment internally
    void addDepartment(String deptName) {
        departments.add(new AcademicDepartment(deptName));
    }

    // Aggregation: faculty passed from outside
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (AcademicDepartment d : departments) {
            d.displayDepartment();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
        System.out.println();
    }
}

