package com.linkedList.DoublyLinkedList.LibraryManagementSystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtEnd(101, "Clean Code", "Robert Martin", "Programming", true);
        library.addAtBeginning(102, "Java Basics", "Herbert Schildt", "Programming", true);
        library.addAtEnd(103, "Atomic Habits", "James Clear", "Self-Help", false);
        library.addAtPosition(2, 104, "The Alchemist", "Paulo Coelho", "Fiction", true);

        System.out.println("Books (Forward):");
        library.displayForward();

        System.out.println("\nBooks (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("James Clear");

        System.out.println("\nUpdate Availability:");
        library.updateAvailability(103, true);

        System.out.println("\nAfter Update:");
        library.displayForward();

        System.out.println("\nRemove Book:");
        library.removeById(102);

        System.out.println("\nFinal Library:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}
