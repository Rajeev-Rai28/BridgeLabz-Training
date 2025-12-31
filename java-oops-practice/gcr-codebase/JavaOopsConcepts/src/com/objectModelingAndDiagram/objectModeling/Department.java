package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName)); // Employee created inside Department
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

