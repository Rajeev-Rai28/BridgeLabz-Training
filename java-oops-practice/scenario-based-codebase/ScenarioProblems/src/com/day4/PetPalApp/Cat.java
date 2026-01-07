package com.day4.PetPalApp;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}
