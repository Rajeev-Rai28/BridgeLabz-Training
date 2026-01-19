package com.day4.eventManager;

public class EventManagerMain {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(500),
            new Ticket(150),
            new Ticket(1200),
            new Ticket(300),
            new Ticket(50),
            new Ticket(900)
        };

        EventManager.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("Sorted Tickets by Price:");
        for (Ticket t : tickets) {
            System.out.println(t);
        }

        System.out.println("\nTop 3 Cheapest:");
        for (int i = 0; i < 3; i++) {
            System.out.println(tickets[i]);
        }
    }
}

