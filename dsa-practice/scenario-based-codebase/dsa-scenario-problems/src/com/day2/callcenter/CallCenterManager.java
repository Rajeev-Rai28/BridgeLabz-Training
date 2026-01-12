package com.day2.callcenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CallCenterManager {

    // Normal customer queue
    private Queue<Customer> normalQueue = new LinkedList<>();

    // Priority customer queue
    private Queue<Customer> priorityQueue = new LinkedList<>();

    // HashMap to track how many times a customer has called this month
    private HashMap<String, Integer> callCountMap = new HashMap<>();

    // Add new incoming call
    public void addCall(Customer customer) {

        // Update call count in HashMap
        if (callCountMap.containsKey(customer.customerId)) {
            callCountMap.put(customer.customerId, callCountMap.get(customer.customerId) + 1);
        } else {
            callCountMap.put(customer.customerId, 1);
        }

        // Add to appropriate queue
        if (customer.isPriority) {
            priorityQueue.offer(customer);
            System.out.println("📞 Priority customer added: " + customer.name);
        } else {
            normalQueue.offer(customer);
            System.out.println("📞 Normal customer added: " + customer.name);
        }
    }

    // Serve next customer
    public void serveNextCustomer() {

        Customer served = null;

        // Priority queue gets preference
        if (!priorityQueue.isEmpty()) {
            served = priorityQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            served = normalQueue.poll();
        }

        if (served != null) {
            System.out.println("✅ Serving: " + served);
        } else {
            System.out.println("❌ No customers in queue!");
        }
    }

    // Show queues
    public void showQueues() {

        System.out.println("\n--- 📌 Priority Queue ---");
        if (priorityQueue.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Customer c : priorityQueue) {
                System.out.println(c);
            }
        }

        System.out.println("\n--- 📌 Normal Queue ---");
        if (normalQueue.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Customer c : normalQueue) {
                System.out.println(c);
            }
        }
    }

    // Show how many times a customer has called
    public void showCallCount(String customerId) {
        Integer count = callCountMap.get(customerId);
        if (count == null) {
            System.out.println("Customer has not called yet.");
        } else {
            System.out.println("Customer ID " + customerId + " has called " + count + " times this month.");
        }
    }

    // Show full call count report
    public void showMonthlyCallReport() {
        System.out.println("\n📊 Monthly Call Report:");
        for (String id : callCountMap.keySet()) {
            System.out.println("Customer ID " + id + " → Calls: " + callCountMap.get(id));
        }
    }
}
