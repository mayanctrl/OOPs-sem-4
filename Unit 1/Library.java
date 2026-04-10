import java.util.ArrayList;

// Class 1: The Data Model
class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Returns a formatted string for easy printing
    public String getDetails() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + isbn;
    }
}

// Class 2: The Management System
public class Library {
    // A collection to hold Book objects
    private ArrayList<Book> bookList = new ArrayList<>();

    // Method to add a book
    public void addBook(Book newBook) {
        bookList.add(newBook);
        System.out.println("Added: " + newBook.title);
    }

    // Method to remove a book by searching for its ISBN
    public void removeBook(String targetIsbn) {
        boolean found = false;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).isbn.equals(targetIsbn)) {
                System.out.println("Removing: " + bookList.get(i).title);
                bookList.remove(i);
                found = true;
                break; // Exit loop once the book is found and removed
            }
        }
        if (!found) {
            System.out.println("Error: Book with ISBN " + targetIsbn + " not found.");
        }
    }

    // Method to display all books
    public void displayAllBooks() {
        System.out.println("\n--- Current Library Inventory ---");
        if (bookList.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            for (Book b : bookList) {
                System.out.println(b.getDetails());
            }
        }
        System.out.println("---------------------------------\n");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Library myLibrary = new Library();

        // 1. Create and Add books
        myLibrary.addBook(new Book("Java Programming", "John Smith", "111-AAA"));
        myLibrary.addBook(new Book("Data Structures", "Jane Doe", "222-BBB"));
        myLibrary.addBook(new Book("Modern AI", "Alan Turing", "333-CCC"));

        // 2. Display all books
        myLibrary.displayAllBooks();

        // 3. Remove a book by ISBN
        myLibrary.removeBook("222-BBB");

        // 4. Display again to verify removal
        myLibrary.displayAllBooks();
    }
} 

