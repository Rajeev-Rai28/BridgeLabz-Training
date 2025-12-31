package com.objectModelingAndDiagram.objectModeling;

public class AcademicDepartment {
    String deptName;

    AcademicDepartment(String deptName) {
        this.deptName = deptName;
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
    }
}

