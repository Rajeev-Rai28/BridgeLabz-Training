package com.day1.vehicleRentalApplication;

public class Customer {
	String name;
	int custId;
	
	public Customer(String name, int custId) {
		this.name = name;
		this.custId = custId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCustId() {
		return custId;
	}

}