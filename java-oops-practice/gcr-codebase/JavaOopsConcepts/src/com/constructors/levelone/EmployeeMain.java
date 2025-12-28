package com.constructors.levelone;

public class EmployeeMain {
	public static void main(String[] args) {

        Manager m1 = new Manager(
                1001,
                "Software Development",
                75000,
                "Project Manager"
        );

        m1.displayManagerDetails();

        // Modify salary using public method
        m1.setSalary(82000);
        System.out.println("Updated Salary: ₹" + m1.getSalary());
    }
}
