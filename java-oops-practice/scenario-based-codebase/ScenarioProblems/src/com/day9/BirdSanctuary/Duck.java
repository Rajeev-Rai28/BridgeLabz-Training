package com.day9.BirdSanctuary;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String name, String id) {
        super(name, "Duck", id);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying at low height...");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming in the water...");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getName()
                + ", Species: Duck, Ability: Fly & Swim");
    }
}

