package com.day1.universityEnrollmentSystem;

public class Enrollment implements Graded {

    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Letter grading system
    @Override
    public void assignGrade(String grade) {
        double gpaValue = 0.0;

        if (grade.equals("A")) gpaValue = 4.0;
        else if (grade.equals("B")) gpaValue = 3.0;
        else if (grade.equals("C")) gpaValue = 2.0;
        else if (grade.equals("D")) gpaValue = 1.0;

        student.updateGpa(gpaValue);
    }

    // Pass / Fail grading (polymorphism )
    public void assignGrade(boolean pass) {
        student.updateGpa(pass ? 2.0 : 0.0);
    }
}