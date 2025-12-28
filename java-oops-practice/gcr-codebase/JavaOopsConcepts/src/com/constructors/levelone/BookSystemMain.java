package com.constructors.levelone;

public class BookSystemMain {
	public static void main(String[] args) {

        BookSystem b1 = new BookSystem("978-0135166307", "Core Java", "Cay S. Horstmann");
        b1.displayBookDetails();

        // Modify private author using setter
        b1.setAuthor("Herbert Schildt");
        System.out.println("Updated Author: " + b1.getAuthor());

        // EBook object
        EBook eb1 = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.2);

        eb1.displayEBookDetails();
    }

}
