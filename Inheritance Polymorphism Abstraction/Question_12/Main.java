package Inheritance.Question_12;

// Q. A drawing application is being developed where different shapes can be created.
// All shapes share some common properties, so a base class Shape is created with a
// method display() to show general shape information.
// Two specific shapes, Circle and Rectangle, inherit from the Shape class. Each shape
// has its own method to calculate and display its area.
// This demonstrates hierarchical inheritance, where multiple subclasses inherit from a
// single base class.

class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

// Circle class inheriting Shape
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Rectangle class inheriting Shape
class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        // Using Circle
        c.display();
        c.calculateArea();

        System.out.println();

        // Using Rectangle
        r.display();
        r.calculateArea();
    }
}

/*
 * Sample Output:
 * 
 * This is a shape.
 * Area of Circle: 78.53981633974483
 * 
 * This is a shape.
 * Area of Rectangle: 24.0
 */