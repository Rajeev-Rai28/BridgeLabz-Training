package com.Collections.QueueInterface.HospitalTriageSystem;

import java.util.PriorityQueue;

public class HospitalTriage {

    public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>(
                (p1, p2) -> p2.getSeverity() - p1.getSeverity());

        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); 
        }
    }
}
