package com.day4.PetPalApp;

import java.util.ArrayList;

public class PetPalApplication {

    public static void main(String[] args) {

        ArrayList<Pet> pets = new ArrayList<>();

        // Polymorphism
        Pet p1 = new Dog("Buddy", 3);
        Pet p2 = new Cat("Kitty", 2);
        Pet p3 = new Bird("Tweety", 1);

        pets.add(p1);
        pets.add(p2);
        pets.add(p3);

        for (Pet p : pets) {
            p.showStatus();
            p.makeSound();

            p.feed();
            p.play();
            p.sleep();

            p.showStatus();
            System.out.println("-----------------------------");
        }
    }
}
