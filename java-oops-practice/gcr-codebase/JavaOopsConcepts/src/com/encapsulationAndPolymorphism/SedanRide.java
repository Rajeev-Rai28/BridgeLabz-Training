package com.encapsulationAndPolymorphism;

class SedanRide extends RideUnit {

    public SedanRide(int unitId, String driver) {
        super(unitId, driver, 16);
    }

    @Override
    double computeFare(double distance) {
        return distance * costPerKm;
    }
}
