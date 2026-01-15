package com.day9.BirdSanctuary;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String name, String id) {
        super(name, "Penguin", id);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming very fast!");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getName()
                + ", Species: Penguin, Ability: Swim");
    }
}

