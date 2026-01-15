package com.day9.BirdSanctuary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SanctuaryApp {

    static ArrayList<Bird> sanctuary = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n🐦 Welcome to EcoWing Bird Sanctuary 🐦");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display All Flying Birds");
            System.out.println("4. Display All Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addBird();
                case 2 -> displayAll();
                case 3 -> displayFlying();
                case 4 -> displaySwimming();
                case 5 -> displayBoth();
                case 6 -> deleteById();
                case 7 -> report();
                case 8 -> {
                    System.out.println("Thank you for using EcoWing Sanctuary!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void addBird() {
        System.out.println("Select Bird Type:");
        System.out.println("1. Eagle  2. Duck  3. Penguin  4. Kiwi");
        int type = sc.nextInt();

        System.out.print("Enter Bird Name: ");
        String name = sc.next();
        System.out.print("Enter Bird ID: ");
        String id = sc.next();

        Bird b = null;

        switch (type) {
            case 1 -> b = new Eagle(name, id);
            case 2 -> b = new Duck(name, id);
            case 3 -> b = new Penguin(name, id);
            case 4 -> b = new Kiwi(name, id);
            default -> {
                System.out.println("Invalid bird type!");
                return;
            }
        }

        sanctuary.add(b);
        System.out.println("✅ Bird added successfully!");
    }

    static void displayAll() {
        if (sanctuary.isEmpty()) {
            System.out.println("No birds in sanctuary.");
            return;
        }

        for (Bird b : sanctuary) {
            b.displayInfo();
            b.eat();

            if (b instanceof Flyable f) {
                f.fly();
            }
            if (b instanceof Swimmable s) {
                s.swim();
            }
            System.out.println("---------------------------");
        }
    }

    static void displayFlying() {
        for (Bird b : sanctuary) {
            if (b instanceof Flyable) {
                b.displayInfo();
            }
        }
    }

    static void displaySwimming() {
        for (Bird b : sanctuary) {
            if (b instanceof Swimmable) {
                b.displayInfo();
            }
        }
    }

    static void displayBoth() {
        for (Bird b : sanctuary) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                b.displayInfo();
            }
        }
    }

    static void deleteById() {
        System.out.print("Enter Bird ID to delete: ");
        String id = sc.next();

        Iterator<Bird> it = sanctuary.iterator();
        while (it.hasNext()) {
            Bird b = it.next();
            if (b.getId().equals(id)) {
                it.remove();
                System.out.println("✅ Bird removed successfully!");
                return;
            }
        }
        System.out.println("❌ Bird not found!");
    }

    static void report() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : sanctuary) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("📊 ---- Sanctuary Report ----");
        System.out.println("Flying Birds   : " + fly);
        System.out.println("Swimming Birds : " + swim);
        System.out.println("Both           : " + both);
        System.out.println("Neither        : " + neither);
    }
}

