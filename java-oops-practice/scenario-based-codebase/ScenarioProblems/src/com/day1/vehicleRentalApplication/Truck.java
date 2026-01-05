package com.day1.vehicleRentalApplication;

public class Truck extends Vehicle {
	public Truck(String vehicleType, String vehicleNumber, int baseRate) {
		super("Truck", vehicleNumber, 200);
		
	}
	@Override
	public double rentCalculation(int days) {
		return (baseRate*days+30);
	}
	
	public void display() {
		System.out.println("Vehicle type : "+vehicleType+", Vehicle Number : "+vehicleNumber+", Base Rate : "+baseRate);
	}
}
