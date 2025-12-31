package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class CampusSystem {
    String campusName;
    ArrayList<Learner> learners;
    ArrayList<Instructor> instructors;

    CampusSystem(String campusName) {
        this.campusName = campusName;
        learners = new ArrayList<>();
        instructors = new ArrayList<>();
    }

    void addLearner(Learner learner) {
        learners.add(learner);
    }

    void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    void showCampusDetails() {
        System.out.println("Campus: " + campusName);

        System.out.println("Learners:");
        for (Learner l : learners) {
            System.out.println("- " + l.learnerName);
        }

        System.out.println("Instructors:");
        for (Instructor i : instructors) {
            System.out.println("- " + i.instructorName);
        }
        System.out.println();
    }
}

