package com.day2.TrainCompanion;

public class Compartment {

    String name;        // e.g., S1, S2, Pantry, AC1, etc.
    Compartment prev;   // previous compartment
    Compartment next;   // next compartment

    public Compartment(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}
