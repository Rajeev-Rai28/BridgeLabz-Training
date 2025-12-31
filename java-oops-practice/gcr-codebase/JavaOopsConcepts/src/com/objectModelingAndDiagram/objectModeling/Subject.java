package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Subject {
    String subjectName;
    Instructor instructor;
    ArrayList<Learner> learners;

    Subject(String subjectName) {
        this.subjectName = subjectName;
        learners = new ArrayList<>();
    }

    // Communication
    void assignInstructor(Instructor instructor) {
        this.instructor = instructor;
        instructor.addSubject(this);
        System.out.println(instructor.instructorName +
                " assigned to subject " + subjectName);
    }

    void addLearner(Learner learner) {
        learners.add(learner);
    }

    void showDetails() {
        System.out.println("Subject: " + subjectName);
        System.out.println("Instructor: " +
                (instructor != null ? instructor.instructorName : "Not Assigned"));

        System.out.println("Enrolled Learners:");
        for (Learner l : learners) {
            System.out.println("- " + l.learnerName);
        }
        System.out.println();
    }
}

