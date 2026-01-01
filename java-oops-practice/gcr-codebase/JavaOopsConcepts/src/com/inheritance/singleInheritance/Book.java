package com.inheritance.singleInheritance;

//Superclass
public class Book {
 String title;
 int publicationYear;

 // Constructor
 Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }

 // Method to display book info
 void displayInfo() {
     System.out.println("Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}

