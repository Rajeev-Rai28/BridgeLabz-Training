package com.constructors.levelone;

public class PostgraduateStudent extends Student {

    String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method accessing protected variable
    void displayPGDetails() {
        System.out.println("Roll Number    : " + rollNumber); // public
        System.out.println("Name           : " + name);       // protected
        System.out.println("Specialization : " + specialization);
        System.out.println("CGPA           : " + getCGPA());  // private via getter
        System.out.println("-------------------------");
    }
}

