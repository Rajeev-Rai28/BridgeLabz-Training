package com.day6.IceCreamRush;

public class IceCreamRushApp {

    public static void main(String[] args) {

        IceCreamFlavor[] flavors = {
            new IceCreamFlavor("Vanilla", 120),
            new IceCreamFlavor("Chocolate", 200),
            new IceCreamFlavor("Strawberry", 90),
            new IceCreamFlavor("Mango", 150),
            new IceCreamFlavor("Butterscotch", 110),
            new IceCreamFlavor("Pista", 70),
            new IceCreamFlavor("Black Currant", 60),
            new IceCreamFlavor("Kesar", 100)
        };

        System.out.println("Before Sorting (Manual Weekly Data):");
        for (IceCreamFlavor f : flavors) {
            System.out.println(f);
        }

        FlavorSorter.bubbleSort(flavors);

        System.out.println("\nAfter Sorting (By Popularity - Most Sold First):");
        for (IceCreamFlavor f : flavors) {
            System.out.println(f);
        }
    }
}
