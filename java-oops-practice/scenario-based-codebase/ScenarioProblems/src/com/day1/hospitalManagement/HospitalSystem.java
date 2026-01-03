package com.day1.hospitalManagement;

public class HospitalSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Karan", "Diabetes", 5);
        Patient p2 = new OutPatient(102, "Amit");

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");

        Bill bill = new Bill(10000, 0.18, 1000);


        p1.displayInfo();  // Polymorphism
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Bill Amount: ₹" + bill.calculatePayment());
    }
}

