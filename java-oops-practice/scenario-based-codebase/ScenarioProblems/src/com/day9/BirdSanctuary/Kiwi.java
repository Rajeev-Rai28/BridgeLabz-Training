package com.day9.BirdSanctuary;

public class Kiwi extends Bird {

    public Kiwi(String name, String id) {
        super(name, "Kiwi", id);
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getName()
                + ", Species: Kiwi, Ability: None");
    }
}

