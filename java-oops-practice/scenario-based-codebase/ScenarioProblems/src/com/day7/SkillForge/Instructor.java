package com.day7.SkillForge;

public class Instructor extends User {

    public Instructor(String name, String email) {
        super(name, email);
    }

    public void uploadCourse(String courseName) {
        System.out.println(name + " uploaded course: " + courseName);
    }
}
