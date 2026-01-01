package com.inheritance.hierarchicalInheritance;

public class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        displayBasicInfo();
        System.out.println("Subject: " + subject);
    }
}

