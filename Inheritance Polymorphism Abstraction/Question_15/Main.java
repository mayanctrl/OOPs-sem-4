package Inheritance.Question_15;

// Q. Create a base class Person with method role().
// Create subclasses:
// Employee
// Manager (extends Employee)
// Override role() in each class and demonstrate multilevel inheritance with runtime
// polymorphism.

class Person {
    void role() {
        System.out.println("I am a person.");
    }
}

// Employee class inherits Person
class Employee extends Person {
    @Override
    void role() {
        System.out.println("I am an employee.");
    }
}

// Manager class inherits Employee (multilevel inheritance)
class Manager extends Employee {
    @Override
    void role() {
        System.out.println("I am a manager.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Person p;

        p = new Person();
        p.role();

        p = new Employee();
        p.role();

        p = new Manager();
        p.role();
    }
}

/*
 * Sample Output:
 * 
 * I am a person.
 * I am an employee.
 * I am a manager.
 */