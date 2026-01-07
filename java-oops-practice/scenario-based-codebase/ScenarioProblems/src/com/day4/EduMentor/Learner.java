package com.day4.EduMentor;

class Learner extends User implements ICertifiable {

    private boolean fullTimeCourse;

    public Learner(String name, String email, int userId, boolean fullTimeCourse) {
        super(name, email, userId);
        this.fullTimeCourse = fullTimeCourse;
    }

    @Override
    public void generateCertificate() {
        if (fullTimeCourse) {
            System.out.println(" Full-Time Course Certificate Generated for " + name);
        } else {
            System.out.println(" Short Course Certificate Generated for " + name);
        }
    }
}