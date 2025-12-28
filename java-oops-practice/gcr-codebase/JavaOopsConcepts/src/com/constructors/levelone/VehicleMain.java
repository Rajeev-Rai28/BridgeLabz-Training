package com.constructors.levelone;

public class VehicleMain {

	public static void main(String[] args) {

	        Vehicle v1 = new Vehicle("Rajeev Rai", "Four Wheeler");
	        Vehicle v2 = new Vehicle("Amit Sharma", "two Wheeler");

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();

	        // Update registration fee for all vehicles
	        Vehicle.updateRegistrationFee(2500);

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();
	    }
}
