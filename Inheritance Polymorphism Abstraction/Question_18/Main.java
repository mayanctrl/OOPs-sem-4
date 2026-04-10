package Inheritance.Question_18;

// Q. A bank has a fixed interest rate that should not be changed once it is defined.
// Create a class Bank with a final variable interestRate.
// Create a method calculateInterest(double amount) that calculates the interest using
// the fixed rate.
// Write a program to calculate interest for different customers.

class Bank {

    // Final variable (constant interest rate)
    final double interestRate = 5.0; // 5%

    // Method to calculate interest
    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        // Different customers with different amounts
        double customer1 = 10000;
        double customer2 = 25000;
        double customer3 = 50000;

        System.out.println("Interest for Customer 1: ₹" + bank.calculateInterest(customer1));
        System.out.println("Interest for Customer 2: ₹" + bank.calculateInterest(customer2));
        System.out.println("Interest for Customer 3: ₹" + bank.calculateInterest(customer3));
    }
}

/*
 * Sample Output:
 * 
 * Interest for Customer 1: ₹500.0
 * Interest for Customer 2: ₹1250.0
 * Interest for Customer 3: ₹2500.0
 */
