package com.day6.fleetManager;

public class FleetManagerApp {

    public static void main(String[] args) {

        // Assume these came from different depots and are already sorted
        Vehicle[] vehicles = {
            new Vehicle("MP09-AB-1234", 12000),
            new Vehicle("MP09-CD-5678", 18000),
            new Vehicle("MP09-EF-9999", 25000),
            new Vehicle("MP09-GH-2222", 15000),
            new Vehicle("MP09-IJ-7777", 30000),
            new Vehicle("MP09-KL-4444", 20000)
        };

        System.out.println("Before Master Scheduling:");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

        MaintenanceScheduler.mergeSort(vehicles, 0, vehicles.length - 1);

        System.out.println("\nAfter Master Scheduling (Sorted by Mileage):");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
