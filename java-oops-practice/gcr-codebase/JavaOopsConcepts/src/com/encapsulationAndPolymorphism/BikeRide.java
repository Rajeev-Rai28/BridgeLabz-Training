package com.encapsulationAndPolymorphism;

class BikeRide extends RideUnit {

    public BikeRide(int unitId, String driver) {
        super(unitId, driver, 9);
    }

    @Override
    double computeFare(double distance) {
        return distance * costPerKm;
    }
}
