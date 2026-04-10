package Inheritance.Question_19;

// Q. A library wants to store details of multiple books.
// Create a class Book with attributes:
// title
// author
// price
// Create an array of Book objects and display the details of all books.

class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating array of Book objects
        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "James Gosling", 499);
        books[1] = new Book("Data Structures", "Mark Allen Weiss", 699);
        books[2] = new Book("Operating Systems", "Galvin", 799);

        // Displaying all book details
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}

/*
 * Sample Output:
 * 
 * Title: Java Basics
 * Author: James Gosling
 * Price: ₹499.0
 * 
 * Title: Data Structures
 * Author: Mark Allen Weiss
 * Price: ₹699.0
 * 
 * Title: Operating Systems
 * Author: Galvin
 * Price: ₹799.0
 */
