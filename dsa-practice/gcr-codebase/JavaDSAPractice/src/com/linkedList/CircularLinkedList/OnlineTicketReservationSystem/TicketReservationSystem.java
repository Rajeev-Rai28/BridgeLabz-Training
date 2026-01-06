package com.linkedList.CircularLinkedList.OnlineTicketReservationSystem;

class TicketReservationSystem {

    private TicketNode head;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {
        TicketNode node = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = head;
    }

    // Remove ticket by ID
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode curr = head, prev = null;

        do {
            if (curr.ticketId == id) {

                // Only one ticket
                if (curr == head && curr.next == head) {
                    head = null;
                    System.out.println("Ticket cancelled");
                    return;
                }

                // Removing head
                if (curr == head) {
                    TicketNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket cancelled");
                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            printTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer name
    public void searchByCustomer(String name) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                printTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for customer: " + name);
    }

    // Search by movie name
    public void searchByMovie(String movie) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                printTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for movie: " + movie);
    }

    // Count total tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    private void printTicket(TicketNode t) {
        System.out.println( "Ticket ID: " + t.ticketId + ", Customer: " + t.customerName +", Movie: " + t.movieName + ", Seat: " + t.seatNumber +", Time: " + t.bookingTime);
    }
}
