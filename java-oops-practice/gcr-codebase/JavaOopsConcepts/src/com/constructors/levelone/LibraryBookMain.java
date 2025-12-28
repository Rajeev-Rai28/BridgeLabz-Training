package com.constructors.levelone;

public class LibraryBookMain {

	public static void main(String[] args) {

		LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 450);

        book1.displayDetails();
        book1.borrowBook();
        book1.borrowBook(); // trying to borrow again
    }

}
