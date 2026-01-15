package com.day9.BirdSanctuary;

public abstract class Bird {
    private String name;
    private String species;
    private String id;

    public Bird(String name, String species, String id) {
        this.name = name;
        this.species = species;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getId() {
        return id;
    }

    public void eat() {
        System.out.println(name + " is eating...");
    }

    public abstract void displayInfo();
}

