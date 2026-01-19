package com.day10.BagBallOrganizer;

import java.util.ArrayList;

public class OrganizerApp {

    public static void main(String[] args) {

        // Create bags
        Bag bag1 = new Bag(1, "Red", 3);
        Bag bag2 = new Bag(2, "Blue", 2);

        // Store all bags
        ArrayList<Bag> bags = new ArrayList<>();
        bags.add(bag1);
        bags.add(bag2);

        // Create balls
        Ball b1 = new Ball(101, "Yellow", "Small");
        Ball b2 = new Ball(102, "Green", "Medium");
        Ball b3 = new Ball(103, "Blue", "Large");
        Ball b4 = new Ball(104, "Red", "Small");

        // Add balls to bag1
        bag1.addBall(b1);
        bag1.addBall(b2);
        bag1.addBall(b3);
        bag1.addBall(b4); // should fail (capacity full)

        // Add balls to bag2
        bag2.addBall(b4);
        bag2.addBall(new Ball(105, "Black", "Medium"));

        // Display all bags and their ball count
        System.out.println("\n--- All Bags ---");
        for (Bag bag : bags) {
            bag.displayInfo();
        }

        // Display balls in each bag
        System.out.println("\n--- Bag Details ---");
        bag1.displayBalls();
        bag2.displayBalls();

        // Remove a ball
        System.out.println("\n--- Removing Ball ---");
        bag1.removeBall(102); // remove ball 102

        // Display again
        bag1.displayBalls();
    }
}

