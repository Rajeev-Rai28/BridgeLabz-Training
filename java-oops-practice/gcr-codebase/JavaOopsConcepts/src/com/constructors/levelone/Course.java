package com.constructors.levelone;

public class Course {

    // Instance variables
    String courseName;
    int duration;        // duration in weeks
    double fee;

    // Class variable (shared by all objects)
    static String instituteName = "TIT Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " weeks");
        System.out.println("Course Fee     : ₹" + fee);
        System.out.println("-----------------------------");
    }

    // Class (static) method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

