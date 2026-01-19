package com.day4.examCell;

public class ExamCellApp {
    public static void main(String[] args) {

        Student[] students = {
            new Student(450),
            new Student(120),
            new Student(999),
            new Student(870),
            new Student(500),
            new Student(760)
        };

        ExamCell.mergeSort(students, 0, students.length - 1);

        System.out.println("State Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + " → " + s.marks);
        }
    }
}

