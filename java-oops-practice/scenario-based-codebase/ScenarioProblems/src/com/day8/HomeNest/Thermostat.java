package com.day8.HomeNest;

class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId, 0.8);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat active");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    public void reset() {
        System.out.println("Thermostat reset to 24°C");
    }
}