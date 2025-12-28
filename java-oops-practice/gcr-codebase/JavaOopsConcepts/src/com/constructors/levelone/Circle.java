package com.constructors.levelone;

public class Circle {
	
	//Attributes
	double radius;
	
	// Default constructors
	Circle(){
		this(5.5); // constructor chaining
	}
	
	// parameterized constructor
	Circle(double radius){
		this.radius = radius;
	}
	
	//Creating method for calculating area of circle
	 void areaCircle() {
			System.out.println(Math.PI*radius*radius);
	}
		
}
