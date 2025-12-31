package com.objectModelingAndDiagram.objectModeling;

public class SchoolMain {
	public static void main(String[] args) {

        // School (Aggregation)
        School school = new School("Green Valley School");

        // Students (Independent)
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        // Courses (Independent)
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // Add students to school
        school.addStudent(s1);
        school.addStudent(s2);

        // Student–Course Association (Many-to-Many)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        // Display
        school.showStudents();
        s1.viewCourses();
        s2.viewCourses();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
