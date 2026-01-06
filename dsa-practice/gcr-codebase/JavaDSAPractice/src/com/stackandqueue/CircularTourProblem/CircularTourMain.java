package com.stackandqueue.CircularTourProblem;

public class CircularTourMain {
    public static void main(String[] args) {

        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int start = CircularTour.findStart(pumps);

        if (start != -1) {
            System.out.println("Start at petrol pump index: " + start);
        } else {
            System.out.println("No possible tour");
        }
    }
}