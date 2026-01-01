package com.inheritance.multilevelInheritance;

public class CourseMain {
    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Udemy",
                true,
                10000,
                20
        );

        course.displayDetails();
    }
}

