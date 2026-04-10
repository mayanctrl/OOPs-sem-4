/* 1. Create a class called UsernameValidator.
 Accept a username from the user.
 Remove leading and trailing spaces.
 Convert the username to lowercase.
 Display the cleaned username.*/

import java.util.Scanner;

class UsernameValidator {

    String username;

    // Method to accept and process username
    void validateUsername() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        username = sc.nextLine();

        // Remove leading and trailing spaces
        username = username.trim();

        // Convert to lowercase
        username = username.toLowerCase();

        // Display cleaned username
        System.out.println("Cleaned Username: " + username);
    }

    public static void main(String[] args) {
        UsernameValidator obj = new UsernameValidator();
        obj.validateUsername();
    }
}