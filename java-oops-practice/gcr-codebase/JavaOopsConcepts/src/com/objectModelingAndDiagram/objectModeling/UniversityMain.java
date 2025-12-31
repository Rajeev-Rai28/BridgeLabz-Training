package com.objectModelingAndDiagram.objectModeling;

public class UniversityMain {
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma", "Physics");
        Faculty f2 = new Faculty("Dr. Mehta", "Computer Science");

        University uni = new University("National Technical University");

        uni.addDepartment("Engineering");
        uni.addDepartment("Science");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayUniversity();

        // Delete University
        uni = null;

        System.out.println("University deleted.");
        System.out.println("Departments deleted with University.");
        System.out.println("Faculty still exists:");

        f1.displayFaculty();
        f2.displayFaculty();
    }
}

