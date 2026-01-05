package com.day1.SmartHomeAutomationSystem;

class UserController {

    public void controlDevice(Controllable device, boolean power) {
        if (power) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerConsumption() > a2.getPowerConsumption()) {
            System.out.println("First appliance consumes more energy");
        } else if (a1.getPowerConsumption() < a2.getPowerConsumption()) {
            System.out.println("Second appliance consumes more energy");
        } else {
            System.out.println("Both appliances consume equal energy");
        }
    }
}
