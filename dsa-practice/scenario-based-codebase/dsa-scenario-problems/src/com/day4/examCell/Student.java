package com.day4.examCell;

class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "" + marks;
    }
}
