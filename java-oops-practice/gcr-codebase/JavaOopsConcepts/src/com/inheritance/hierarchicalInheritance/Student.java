package com.inheritance.hierarchicalInheritance;

public class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        displayBasicInfo();
        System.out.println("Grade: " + grade);
    }
}

