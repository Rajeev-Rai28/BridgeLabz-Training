package com.day1.vehicleRentalApplication;

public class Bike extends Vehicle {
	
	public Bike(String vehicleType, String vehicleNumber, int baseRate) {
		super("Bike", vehicleNumber, 100);
		
	}
	@Override
	public double rentCalculation(int days) {
		return (baseRate*days+10);
	}
	
	public void display() {
		System.out.println("Vehicle type : "+vehicleType+", Vehicle Number : "+vehicleNumber+", Base Rate : "+baseRate);
	}

}
