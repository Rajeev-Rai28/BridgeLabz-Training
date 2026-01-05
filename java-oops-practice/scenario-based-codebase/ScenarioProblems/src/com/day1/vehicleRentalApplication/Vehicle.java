package com.day1.vehicleRentalApplication;

public class Vehicle {
	
	protected String vehicleType;
	protected String vehicleNumber;
	protected int baseRate;
	
	
	public Vehicle(String vehicleType, String vehicleNumber, int baseRate) {
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.baseRate = baseRate;
		
	}
	
	//Encapsulation
	public String getVehicleType() {
		return vehicleType;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public void setBaserate(int baseRate) {
		this.baseRate = baseRate;
	}
	
	//display
	public void display() {
		System.out.println("Vehicle type : "+vehicleType+", Vehicle Number : "+vehicleNumber+", Base Rate : "+baseRate);
	}

	public double rentCalculation(int days) {
		// TODO Auto-generated method stub
		return 0;
	}
}
