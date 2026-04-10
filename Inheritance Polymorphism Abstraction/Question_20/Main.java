package Inheritance.Question_20;

// Q. A company wants to clearly assign constructor parameters to object variables.
// Create a class Employee with variables name and salary.
// Use this keyword inside the constructor to initialize object variables.
// Display employee details.

class Employee {
    String name;
    double salary;

    // Constructor using 'this' keyword
    Employee(String name, double salary) {
        this.name = name; // refers to instance variable
        this.salary = salary;
    }

    // Method to display details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 50000);
        Employee e2 = new Employee("Priya", 60000);

        e1.display();
        System.out.println();
        e2.display();
    }
}

/*
 * Sample Output:
 * 
 * Employee Name: Rahul
 * Salary: ₹50000.0
 * 
 * Employee Name: Priya
 * Salary: ₹60000.0
 */