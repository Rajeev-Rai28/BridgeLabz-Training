package com.day9.BirdSanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name, String id) {
        super(name, "Eagle", id);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying high in the sky!");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getName()
                + ", Species: Eagle, Ability: Fly");
    }
}
