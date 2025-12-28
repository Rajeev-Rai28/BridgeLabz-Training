package com.constructors.levelone;

public class StudentMain {

	public static void main(String[] args) {

        Student s1 = new Student(101, "Rajeev Rai", 7.8);
        s1.displayStudentDetails();

        // Modify CGPA using public method
        s1.setCGPA(8.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        // Postgraduate student
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Amit Sharma", 8.5, "VLSI Design");

        pg1.displayPGDetails();
    }

}
