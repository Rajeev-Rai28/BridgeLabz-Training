package com.day2.CabbyGo;

interface IRideService {
    void bookRide(Vehicle vehicle, Driver driver, double distance);
    void endRide();
}