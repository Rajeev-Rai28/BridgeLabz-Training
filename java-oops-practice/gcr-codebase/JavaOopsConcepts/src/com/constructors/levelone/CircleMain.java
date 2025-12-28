package com.constructors.levelone;

public class CircleMain {

	public static void main(String[] args) {
		
		//create a circle class object for default constructor
		Circle c1 = new Circle();
		c1.areaCircle();
		
		//create a circle class object for parameterized constructor
		Circle c2 = new Circle(7.5);
		c2.areaCircle();

	}

}
