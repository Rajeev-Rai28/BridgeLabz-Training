package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Learner {
    String learnerName;
    ArrayList<Subject> subjects;

    Learner(String learnerName) {
        this.learnerName = learnerName;
        subjects = new ArrayList<>();
    }

    // Communication
    void enrollSubject(Subject subject) {
        subjects.add(subject);
        subject.addLearner(this);

        System.out.println(learnerName +
                " enrolled in subject " + subject.subjectName);
    }

    void viewSubjects() {
        System.out.println(learnerName + " enrolled subjects:");
        for (Subject s : subjects) {
            System.out.println("- " + s.subjectName);
        }
        System.out.println();
    }
}

