package com.day2.TrafficManager;

public class Roundabout {

    private CarNode head = null;

    // Add car to roundabout
    public void addCar(String carNumber) {
        CarNode newNode = new CarNode(carNumber);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        CarNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove car from roundabout
    public void removeCar(String carNumber) {
        if (head == null) {
            System.out.println(" Roundabout is empty!");
            return;
        }

        CarNode curr = head;
        CarNode prev = null;

        // Only one node case
        if (head.next == head && head.carNumber.equals(carNumber)) {
            head = null;
            System.out.println("Car removed: " + carNumber);
            return;
        }

        do {
            if (curr.carNumber.equals(carNumber)) {
                if (curr == head) {
                    // Remove head
                    CarNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println(" Car removed: " + carNumber);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println(" Car not found in roundabout!");
    }

    // Print roundabout
    public void printRoundabout() {
        if (head == null) {
            System.out.println(" Roundabout is empty!");
            return;
        }

        System.out.print(" Roundabout: ");
        CarNode temp = head;
        do {
            System.out.print(temp.carNumber + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }

    public boolean isEmpty() {
        return head == null;
    }
}

