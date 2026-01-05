package com.day1.universityEnrollmentSystem;

class Student {

    private String name;
    private int rollNo;
    private double gpa;   

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.gpa = 0.0;
    }

    public Student(String name, int rollNo, double initialGpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.gpa = initialGpa;
    }

    protected void updateGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public String getTranscript() {
        return "Name: " + name + ", Roll No: " + rollNo + ", GPA: " + gpa;
    }
}
