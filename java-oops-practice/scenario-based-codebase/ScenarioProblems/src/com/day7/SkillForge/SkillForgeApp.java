package com.day7.SkillForge;

public class SkillForgeApp {
    public static void main(String[] args) {

        // Create instructor
        Instructor instructor = new Instructor("Mr. Sharma", "sharma@gmail.com");

        // Create course with custom modules
        String[] modules = {"Java Basics", "OOP", "Collections", "Spring"};
        Course course = new Course("Java Full Stack", instructor, modules);

        // Instructor uploads course
        instructor.uploadCourse("Java Full Stack");

        // Create student
        Student student = new Student("Rajeev", "rajeev@gmail.com");

        // Student enrolls
        student.enrollCourse(course.getTotalModules());

        // Student completes modules
        student.completeModule(20);
        student.completeModule(18);
        student.completeModule(19);
        student.completeModule(22);

        // Add review and update rating
        course.addReview("Very good course!");
        course.updateRating(5);

        System.out.println("Course Rating: " + course.getRating());

        // Generate certificate (polymorphism)
        course.generateCertificate(student);
    }
}
