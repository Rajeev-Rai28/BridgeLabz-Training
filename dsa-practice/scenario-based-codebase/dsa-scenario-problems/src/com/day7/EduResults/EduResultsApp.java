package com.day7.EduResults;

import java.util.*;

public class EduResultsApp {

    public static void main(String[] args) {

        Student[] students = {
            new Student("Amit", 78),
            new Student("Neha", 92),
            new Student("Raj", 85),
            new Student("Pooja", 92),
            new Student("Vikas", 70)
        };

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        EduResultsSorter.mergeSort(students, 0, students.length - 1);

        System.out.println("\nFinal State Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + " : " + s);
        }
    }
}

