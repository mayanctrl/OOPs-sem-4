package Inheritance.Question_9;

// Q. In a Calculator class, create multiple methods named add() with different
// parameter lists (e.g., one taking two integers, another taking three integers, and a
// third taking two doubles).
// Call the add() method with various arguments in your main program, demonstrating
// that the correct method is selected at compile time based on the arguments provided.

class Calculator {

    // Method 1: add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling different overloaded methods
        int sum1 = calc.add(10, 20); // calls method with 2 ints
        int sum2 = calc.add(5, 10, 15); // calls method with 3 ints
        double sum3 = calc.add(2.5, 3.7); // calls method with 2 doubles

        // Display results
        System.out.println("Sum of 2 integers: " + sum1);
        System.out.println("Sum of 3 integers: " + sum2);
        System.out.println("Sum of 2 doubles: " + sum3);
    }
}

/*
 * Sample Output:
 * 
 * Sum of 2 integers: 30
 * Sum of 3 integers: 30
 * Sum of 2 doubles: 6.2
 */
