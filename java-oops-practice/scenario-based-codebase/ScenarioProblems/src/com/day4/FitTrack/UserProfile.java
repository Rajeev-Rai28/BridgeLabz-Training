package com.day4.FitTrack;

class UserProfile {
    private String name;
    private int age;
    private double weight;  // Sensitive data
    private String goal;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "Stay Fit";
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    // Encapsulation
    public double getWeight() {
        return weight;
    }

    public String getSummary() {
        return "Name: " + name + ", Age: " + age + ", Goal: " + goal;
    }
}

