package com.inheritance.singleInheritance;

public class Thermostat extends Device {
    double temperatureSetting;

    // Constructor
    Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override method to add thermostat-specific details
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + " °C");
    }
}

