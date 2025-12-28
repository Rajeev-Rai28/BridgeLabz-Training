package com.constructors.levelone;

public class PersonMain {

	public static void main(String[] args) {
		
		//original object
		Person p1 = new Person("Rajeev", 21);
		p1.display();
		
		//clone object
		Person p2 = new Person(p1);
		p2.display();

	}

}
