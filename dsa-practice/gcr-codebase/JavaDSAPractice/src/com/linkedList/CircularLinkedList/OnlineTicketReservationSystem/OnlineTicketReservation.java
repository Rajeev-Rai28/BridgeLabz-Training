package com.linkedList.CircularLinkedList.OnlineTicketReservationSystem;

public class OnlineTicketReservation {

    public static void main(String[] args) {

        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Ayush", "Inception", "A10", "10:00 AM");
        system.addTicket(102, "Rohit", "Avatar", "B12", "10:15 AM");
        system.addTicket(103, "Aman", "Inception", "A11", "10:20 AM");

        System.out.println("Current Tickets:");
        system.displayTickets();

        System.out.println("\nSearch by Customer:");
        system.searchByCustomer("Ayush");

        System.out.println("\nSearch by Movie:");
        system.searchByMovie("Inception");

        System.out.println("\nRemove Ticket ID 102:");
        system.removeTicket(102);

        System.out.println("\nUpdated Tickets:");
        system.displayTickets();

        System.out.println("\nTotal Tickets Booked: " + system.countTickets());
    }
}