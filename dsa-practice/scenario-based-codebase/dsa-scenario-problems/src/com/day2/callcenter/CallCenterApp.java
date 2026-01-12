package com.day2.callcenter;

public class CallCenterApp {

    public static void main(String[] args) {

        CallCenterManager manager = new CallCenterManager();

        // Create customers
        Customer c1 = new Customer("C101", "Rajeev", false);
        Customer c2 = new Customer("C102", "Amit", true);
        Customer c3 = new Customer("C103", "Neha", false);
        Customer c4 = new Customer("C101", "Rajeev", false); // same customer calling again
        Customer c5 = new Customer("C104", "Priya", true);

        // Incoming calls
        manager.addCall(c1);
        manager.addCall(c2);
        manager.addCall(c3);
        manager.addCall(c4);
        manager.addCall(c5);

        // Show queues
        manager.showQueues();

        // Serve some customers
        System.out.println("\n☎️ Serving customers...");
        manager.serveNextCustomer();
        manager.serveNextCustomer();
        manager.serveNextCustomer();

        // Show call counts
        System.out.println();
        manager.showCallCount("C101"); // Rajeev
        manager.showCallCount("C102"); // Amit

        // Show monthly report
        manager.showMonthlyCallReport();
    }
}
