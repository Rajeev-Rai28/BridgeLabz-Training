package com.day1.vehicleRentalApplication;

public class Customer {
	String name;
	int custId;
	
	public Customer(String name, int custId) {
		this.name = name;
		this.custId = custId;
	}
	public void display() {
		System.out.println("Cutomer Name : "+name+", Customer Id : "+custId);
	}

}
