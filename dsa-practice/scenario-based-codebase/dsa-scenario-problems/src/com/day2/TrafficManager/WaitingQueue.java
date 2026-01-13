package com.day2.TrafficManager;

public class WaitingQueue {

    private String[] queue;
    private int front, rear, size, capacity;

    public WaitingQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void addCar(String car) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add: " + car);
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = car;
        size++;
        System.out.println("Car added to waiting queue: " + car);
    }

    // Dequeue
    public String removeCar() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No car to remove.");
            return null;
        }

        String car = queue[front];
        front = (front + 1) % capacity;
        size--;
        return car;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
