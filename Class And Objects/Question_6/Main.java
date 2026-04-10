package Question_6;

// Question 6: Write a program to print the area of two rectangles having sides (4,5) and (5,8)
// respectively by creating a class named 'Rectangle' with a method named 'Area'
// which returns the area and length and breadth passed as parameters to its constructor.

class Rectangle {
    int length, breadth;

    // Constructor to set length and breadth
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return area
    int Area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {

        // First rectangle with sides (4, 5)
        Rectangle r1 = new Rectangle(4, 5);
        System.out.println("Rectangle 1 (4 x 5):");
        System.out.println("Area = " + r1.Area());

        System.out.println();

        // Second rectangle with sides (5, 8)
        Rectangle r2 = new Rectangle(5, 8);
        System.out.println("Rectangle 2 (5 x 8):");
        System.out.println("Area = " + r2.Area());

    }
}

// ===================== OUTPUT =====================

// Rectangle 1 (4 x 5):
// Area = 20 ← (4 * 5 = 20)

// Rectangle 2 (5 x 8):
// Area = 40 ← (5 * 8 = 40)