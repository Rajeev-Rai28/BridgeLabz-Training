package com.day8.HomeNest;

public class HomeNestApp {
    public static void main(String[] args) {

        Device light = new Light("L101");
        Device camera = new Camera("C202");
        Device thermostat = new Thermostat("T303");
        Device lock = new Lock("K404");

        light.turnOn();
        camera.turnOn();
        thermostat.turnOn();
        lock.turnOn();

        System.out.println("Light energy for 5 hrs: " + light.calculateEnergy(5));
        System.out.println("Camera energy for 3 hrs: " + camera.calculateEnergy(3));

        light.reset();
        camera.reset();
        thermostat.reset();
        lock.reset();
    }
}