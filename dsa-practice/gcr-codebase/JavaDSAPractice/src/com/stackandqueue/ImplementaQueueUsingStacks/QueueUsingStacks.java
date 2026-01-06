package com.stackandqueue.ImplementaQueueUsingStacks;

import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    // Enqueue operation
    public void enqueue(int data) {
        s1.push(data);
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Transfer only if s2 is empty
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    // Peek front element
    public int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}