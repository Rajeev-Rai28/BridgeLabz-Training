package com.constructors.levelone;

public class Person {
	
	// declare attributes
	String name;
	int age;
	
	// parameterized constructor
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(Person p){
		this.name = p.name;
		this.age = p.age;
	}
	
	void display() {
		System.out.print("Name : "+name);
		System.out.println("  Age : "+age);
	}

}
