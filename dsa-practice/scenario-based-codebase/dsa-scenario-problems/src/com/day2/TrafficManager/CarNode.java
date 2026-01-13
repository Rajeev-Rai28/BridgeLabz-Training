package com.day2.TrafficManager;

public class CarNode {
    String carNumber;
    CarNode next;

    public CarNode(String carNumber) {
        this.carNumber = carNumber;
        this.next = null;
    }
}
