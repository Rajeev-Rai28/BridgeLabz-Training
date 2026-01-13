package com.day2.TrafficManager;

public class TrafficManagerApp {

    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        WaitingQueue waitingQueue = new WaitingQueue(3); // capacity 3

        // Add cars to waiting queue
        waitingQueue.addCar("CAR-101");
        waitingQueue.addCar("CAR-102");
        waitingQueue.addCar("CAR-103");
        waitingQueue.addCar("CAR-104"); // overflow

        // Move cars from queue to roundabout
        while (!waitingQueue.isEmpty()) {
            String car = waitingQueue.removeCar();
            System.out.println(" Car entering roundabout: " + car);
            roundabout.addCar(car);
        }

        roundabout.printRoundabout();

        // Remove a car
        roundabout.removeCar("CAR-102");
        roundabout.printRoundabout();

        // Remove non-existing car
        roundabout.removeCar("CAR-999");
    }
}
