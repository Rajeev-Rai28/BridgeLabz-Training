package com.objectModelingAndDiagram.objectModeling;

public class CampusSystemMain {
    public static void main(String[] args) {

        CampusSystem campus = new CampusSystem("Global Tech Campus");

        Learner l1 = new Learner("Aman");
        Learner l2 = new Learner("Sneha");

        Instructor i1 = new Instructor("Dr. Verma");
        Instructor i2 = new Instructor("Dr. Rao");

        Subject s1 = new Subject("Data Structures");
        Subject s2 = new Subject("Operating Systems");

        campus.addLearner(l1);
        campus.addLearner(l2);

        campus.addInstructor(i1);
        campus.addInstructor(i2);

        campus.showCampusDetails();

        s1.assignInstructor(i1);
        s2.assignInstructor(i2);

        l1.enrollSubject(s1);
        l1.enrollSubject(s2);

        l2.enrollSubject(s2);

        l1.viewSubjects();
        l2.viewSubjects();

        i1.viewSubjects();
        i2.viewSubjects();

        s1.showDetails();
        s2.showDetails();
    }
}

