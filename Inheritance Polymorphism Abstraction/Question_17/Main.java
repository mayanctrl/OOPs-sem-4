package Inheritance.Question_17;

// Q. A company wants to track how many employees have been created in the system.
// Create a class Employee with attributes name and id.
// Use a static variable employeeCount that increases every time a new object is created.
// Write a program that:
// • Creates multiple employee objects
// • Displays the total number of employees using a static method

class Employee {
    String name;
    int id;

    // Static variable to count employees
    static int employeeCount = 0;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // increment count whenever object is created
    }

    // Static method to display total employees
    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating employee objects
        Employee e1 = new Employee("Rahul", 101);
        Employee e2 = new Employee("Ankit", 102);
        Employee e3 = new Employee("Priya", 103);

        // Display total employees
        Employee.displayEmployeeCount();
    }
}

/*
 * Sample Output:
 * 
 * Total Employees: 3
 */