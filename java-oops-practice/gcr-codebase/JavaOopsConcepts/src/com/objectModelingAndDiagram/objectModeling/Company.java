package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName)); // Department created inside Company
    }

    void addEmployeeToDepartment(int deptIndex, String empName) {
        departments.get(deptIndex).addEmployee(empName);
    }

    void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}

