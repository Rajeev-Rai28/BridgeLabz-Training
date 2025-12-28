package com.constructors.levelone;

public class CourseMain {

	 public static void main(String[] args) {

	        Course c1 = new Course("Java Full Stack", 12, 30000);
	        Course c2 = new Course("Gen AI", 10, 35000);

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();

	        // Updating institute name for all courses
	        Course.updateInstituteName("Rajeev Academy");

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();
	    }
}
