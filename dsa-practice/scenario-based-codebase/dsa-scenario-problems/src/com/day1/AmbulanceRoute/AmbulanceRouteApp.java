package com.day1.AmbulanceRoute;

public class AmbulanceRouteApp {

    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        // Add hospital units
        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        // Show all units
        route.showUnits();

        System.out.println("\n🚑 Ambulance is searching for available unit...");
        route.findNearestAvailableUnit();

        // Put Surgery under maintenance
        System.out.println("\n🔧 Surgery goes under maintenance...");
        route.removeUnit("Surgery");

        // Show updated units
        System.out.println();
        route.showUnits();

        // Try again
        System.out.println("\n🚑 Ambulance searching again...");
        route.findNearestAvailableUnit();

        // Make ICU available
        System.out.println("\n✅ ICU becomes available...");
        route.setAvailability("ICU", true);

        // Search again
        System.out.println("\n🚑 Ambulance searching again...");
        route.findNearestAvailableUnit();
    }
}
