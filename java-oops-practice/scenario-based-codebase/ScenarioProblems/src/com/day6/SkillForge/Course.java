package com.day6.SkillForge;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICertifiable {

    private String title;
    private Instructor instructor;

    private double rating; // 🔒 protected by encapsulation
    private String[] modules;

    private List<String> reviews = new ArrayList<>(); // read-only from outside

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Advanced"};
        this.rating = 4.0;
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 4.0;
    }

    public int getTotalModules() {
        return modules.length;
    }

    // Only getter for reviews (read-only)
    public List<String> getReviews() {
        return reviews;
    }

    // Add review internally
    public void addReview(String review) {
        reviews.add(review);
    }

    // Encapsulated rating logic
    public void updateRating(double newRating) {
        if (newRating >= 1 && newRating <= 5) {
            rating = (rating + newRating) / 2; // simple average
        }
    }

    public double getRating() {
        return rating;
    }

    // Certificate generation (polymorphism based on course level)
    @Override
    public void generateCertificate(Student student) {
        if (student.getCompletedModules() == modules.length) {
            System.out.println("=================================");
            System.out.println("🎓 CERTIFICATE OF COMPLETION 🎓");
            System.out.println("This certifies that " + student.getName());
            System.out.println("has successfully completed the course:");
            System.out.println(">> " + title);
            System.out.println("Instructor: " + instructor.getName());
            System.out.println("=================================");
        } else {
            System.out.println(student.getName() + " has not completed the course yet!");
        }
    }
}
