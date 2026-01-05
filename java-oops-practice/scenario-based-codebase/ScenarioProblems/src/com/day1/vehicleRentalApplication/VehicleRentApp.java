package com.day1.vehicleRentalApplication;

public class VehicleRentApp {
	public static void main(String [] args) {
		Bike b1 = new Bike(null, "MP101",0);
		Car c1 = new Car(null, "MP202", 0);
		Truck t1 = new Truck(null, "MP 303", 0);
		
		Customer cust1 = new Customer("Raj", 505);
		
		cust1.display();
		
		
		System.out.println("Bike Rent charge : "+b1.rentCalculation(5));
		b1.display();
		System.out.println("Car Rent charge : "+c1.rentCalculation(2));
		c1.display();
		System.out.println("Truck Rent charge : "+t1.rentCalculation(2));
		t1.display();
	}
}
