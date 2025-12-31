package com.objectModelingAndDiagram.objectModeling;

public class Employee {
    String empName;

    Employee(String empName) {
        this.empName = empName;
    }

    void displayEmployee() {
        System.out.println("Employee: " + empName);
    }
}
