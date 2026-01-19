package com.day4.HospitalQueueProject;

public class HospitalMain {
    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("Raj", 5),
            new Patient("Amit", 9),
            new Patient("Neha", 3),
            new Patient("Pooja", 7)
        };

        HospitalQueue.bubbleSort(patients);

        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}

