package com.linkedList.DoublyLinkedList.LibraryManagementSystem;

class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    // Add at beginning
    public void addAtBeginning(int id, String title, String author, String genre, boolean status) {
        BookNode node = new BookNode(id, title, author, genre, status);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add at end
    public void addAtEnd(int id, String title, String author, String genre, boolean status) {
        BookNode node = new BookNode(id, title, author, genre, status);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean status) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addAtBeginning(id, title, author, genre, status);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, status);
            return;
        }

        BookNode node = new BookNode(id, title, author, genre, status);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    // Remove by Book ID
    public void removeById(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book removed successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Update availability status
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by title
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Search by author
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by this author");
        }
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public int countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void printBook(BookNode b) {
        System.out.println( "ID: " + b.bookId +  ", Title: " + b.title + ", Author: " + b.author + ", Genre: " + b.genre +", Available: " + (b.isAvailable ? "Yes" : "No"));
    }
}