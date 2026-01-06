package com.linkedList.DoublyLinkedList.MovieManagementSystem;

public class MovieManagementSystem {

    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtEnd("Avatar", "James Cameron", 2009, 7.8);
        movies.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.9);

        System.out.println("Movies (Forward):");
        movies.displayForward();

        System.out.println("\nMovies (Reverse):");
        movies.displayReverse();

        System.out.println("\nSearch by Director:");
        movies.searchByDirector("James Cameron");

        System.out.println("\nUpdate Rating:");
        movies.updateRating("Avatar", 8.0);

        System.out.println("\nAfter Update:");
        movies.displayForward();

        System.out.println("\nRemove Movie:");
        movies.removeByTitle("Titanic");

        System.out.println("\nFinal Movie List:");
        movies.displayForward();
    }
}