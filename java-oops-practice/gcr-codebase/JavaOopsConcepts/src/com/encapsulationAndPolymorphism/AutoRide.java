package com.encapsulationAndPolymorphism;

class AutoRide extends RideUnit {

    public AutoRide(int unitId, String driver) {
        super(unitId, driver, 11);
    }

    @Override
    double computeFare(double distance) {
        return (distance * costPerKm) + 25; // base charge
    }
}
