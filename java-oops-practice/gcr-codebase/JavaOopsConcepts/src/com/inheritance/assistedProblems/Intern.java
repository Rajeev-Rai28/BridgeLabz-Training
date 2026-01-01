package com.inheritance.assistedProblems;

public class Intern extends Employee {
    int duration;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
        System.out.println("Role: Intern");
    }
}

