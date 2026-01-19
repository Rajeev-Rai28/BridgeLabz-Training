package com.day10.BagBallOrganizer;

import java.util.ArrayList;

public class Bag implements Storable {

    private int bagId;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls;   // Bag HAS-A list of Balls

    public Bag(int bagId, String color, int capacity) {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public int getBagId() {
        return bagId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentBallCount() {
        return balls.size();
    }

    // Add ball
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("❌ Bag " + bagId + " is FULL! Cannot add more balls.");
            return;
        }
        balls.add(ball);
        System.out.println("✅ Ball added to Bag " + bagId);
    }

    // Remove ball by ID
    public void removeBall(int ballId) {
        for (int i = 0; i < balls.size(); i++) {
            if (balls.get(i).getId() == ballId) {
                balls.remove(i);
                System.out.println("✅ Ball " + ballId + " removed from Bag " + bagId);
                return;
            }
        }
        System.out.println("❌ Ball " + ballId + " not found in Bag " + bagId);
    }

    // Display all balls in this bag
    public void displayBalls() {
        System.out.println("🎒 Bag " + bagId + " contains " + balls.size() + " balls:");
        if (balls.isEmpty()) {
            System.out.println("   (No balls in this bag)");
            return;
        }
        for (Ball b : balls) {
            b.displayInfo();
        }
    }

    // Display bag info
    @Override
    public void displayInfo() {
        System.out.println("Bag ID: " + bagId + ", Color: " + color +
                ", Capacity: " + capacity + ", Current Balls: " + balls.size());
    }
}
