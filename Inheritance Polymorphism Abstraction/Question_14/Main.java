package Inheritance.Question_14;

// Q. A company wants to evaluate employee performance.
// Create an abstract class Employee with:
// attributes: name, id
// abstract method calculateBonus()
// Create subclasses:
// Manager → bonus is 20% of salary
// Developer → bonus is 10% of salary plus project incentive
// Demonstrate runtime polymorphism by storing different employee objects in an
// Employee reference and calling calculateBonus().

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateBonus();
}

// Manager class
class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    double calculateBonus() {
        return 0.20 * salary;
    }
}

// Developer class
class Developer extends Employee {
    double salary;
    double incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    @Override
    double calculateBonus() {
        return (0.10 * salary) + incentive;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Manager("Rahul", 101, 50000);
        Employee e2 = new Developer("Ankit", 102, 40000, 5000);

        // Runtime Polymorphism
        System.out.println("Manager Bonus: ₹" + e1.calculateBonus());
        System.out.println("Developer Bonus: ₹" + e2.calculateBonus());
    }
}

/*
 * Sample Output:
 * 
 * Manager Bonus: ₹10000.0
 * Developer Bonus: ₹9000.0
 */