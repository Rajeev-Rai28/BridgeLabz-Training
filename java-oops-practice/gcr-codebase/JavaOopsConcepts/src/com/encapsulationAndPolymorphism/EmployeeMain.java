package com.encapsulationAndPolymorphism;

import java.util.*;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Raj", 50000);
        Employee e2 = new PartTimeEmployee(102, "Amit", 40, 500);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
