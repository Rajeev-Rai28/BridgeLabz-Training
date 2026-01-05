package com.day1.universityEnrollmentSystem;

public class UniversityManagementSystem {

    public static void main(String[] args) {

        Student s1 = new Undergraduate("Ayush", 101);
        Student s2 = new Postgraduate("Rohit", 201, 3.5);

        Course course = new Course("Machine Learning");
        Faculty faculty = new Faculty("Dr. Sharma");

        Enrollment e1 = new Enrollment(s1, course);
        Enrollment e2 = new Enrollment(s2, course);

        // Letter grading
        e1.assignGrade("A");

        // Pass/Fail grading
        e2.assignGrade(true);

        System.out.println("Faculty: " + faculty.getFacultyName());
        System.out.println("\nStudent Transcripts");
        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
    }
}