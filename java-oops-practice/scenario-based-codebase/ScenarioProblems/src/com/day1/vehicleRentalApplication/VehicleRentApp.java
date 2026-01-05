package com.day1.vehicleRentalApplication;

public class VehicleRentApp {
	public static void main(String[] args) {

        Customer customer = new Customer("Ayush", 101);

        Bike bike = new Bike("null", "BIKE-101", 0);
        Car car = new Car("null", "CAR-202", 0);
        Truck truck = new Truck("null", "TRUCK-303", 0);

        int days = 3;

        System.out.println("Customer: " + customer.getName()+"\nCustomer Id : "+customer.getCustId());

        System.out.println("\nRental Details");
        System.out.println("Bike Rent: ₹" + bike.rentCalculation(days));
        System.out.println("Car Rent: ₹" + car.rentCalculation(days));
        System.out.println("Truck Rent: ₹" + truck.rentCalculation(days));
    }
}
