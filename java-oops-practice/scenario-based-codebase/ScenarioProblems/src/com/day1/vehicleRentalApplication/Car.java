package com.day1.vehicleRentalApplication;

public class Car extends Vehicle {
	public Car(String vehicleType, String vehicleNumber, int baseRate) {
		super("Car", vehicleNumber, 150);
		
	}
	@Override
	public double rentCalculation(int days) {
		return (baseRate*days+20);
	}
	
	
	public void display() {
		System.out.println("Vehicle type : "+vehicleType+", Vehicle Number : "+vehicleNumber+", Base Rate : "+baseRate);
	}

}
