package com.day7.SkillForge;

public class Student extends User {

    private int completedModules;
    private int totalModules;
    private int score;

    public Student(String name, String email) {
        super(name, email);
        this.completedModules = 0;
        this.score = 0;
    }

    public void enrollCourse(int totalModules) {
        this.totalModules = totalModules;
        this.completedModules = 0;
        System.out.println(name + " enrolled in course with " + totalModules + " modules.");
    }

    public void completeModule(int marks) {
        completedModules = completedModules + 1;   // operator +
        score = score + marks;                     // operator +
        System.out.println(name + " completed a module. Total completed: " + completedModules);
    }

    public int getCompletedModules() {
        return completedModules;
    }

    public int getTotalModules() {
        return totalModules;
    }

    public int getScore() {
        return score;
    }
}

