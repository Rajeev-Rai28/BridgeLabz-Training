package com.day4.PetPalApp;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated fields
    private int hunger;   // 0 to 100
    private int energy;   // 0 to 100
    private String mood;  // Happy, Normal, Angry

    // Constructor with random values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(50) + 30;   // 30 to 80
        this.energy = r.nextInt(50) + 30;   // 30 to 80

        updateMood();
    }

    // Constructor with user-defined values
    public Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    // Encapsulated logic
    private void updateMood() {
        if (hunger < 30 && energy > 60) {
            mood = "Happy";
        } else if (hunger > 70) {
            mood = "Angry";
        } else {
            mood = "Normal";
        }
    }

    // Feed implementation
    @Override
    public void feed() {
        hunger = hunger - 20;   // operator used
        if (hunger < 0) hunger = 0;
        energy = energy + 10;
        if (energy > 100) energy = 100;
        updateMood();
        System.out.println(name + " has been fed.");
    }

    // Play implementation
    @Override
    public void play() {
        energy = energy - 20;
        hunger = hunger + 15;
        if (energy < 0) energy = 0;
        if (hunger > 100) hunger = 100;
        updateMood();
        System.out.println(name + " played and is now tired.");
    }

    // Sleep implementation
    @Override
    public void sleep() {
        energy = energy + 30;
        if (energy > 100) energy = 100;
        hunger = hunger + 10;
        if (hunger > 100) hunger = 100;
        updateMood();
        System.out.println(name + " is sleeping.");
    }

    // Abstract method (Polymorphism)
    public abstract void makeSound();

    // Public method to view status (not modify!)
    public void showStatus() {
        System.out.println("---- " + name + " (" + type + ") ----");
        System.out.println("Age: " + age);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
        System.out.println();
    }
}
