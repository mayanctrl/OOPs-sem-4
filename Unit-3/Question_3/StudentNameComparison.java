/* 3. Define a class StudentNameComparison.
 Accept two student names.
 Compare them using case-sensitive comparison.

 Compare them using case-insensitive comparison.
 Display appropriate message.*/

import java.util.Scanner;

class StudentNameComparison {

    String name1, name2;

    void compareNames() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first student name: ");
        name1 = sc.nextLine();

        System.out.print("Enter second student name: ");
        name2 = sc.nextLine();

        // Case-sensitive comparison
        if (name1.equals(name2)) {
            System.out.println("Case-Sensitive: Names are equal");
        } else {
            System.out.println("Case-Sensitive: Names are NOT equal");
        }

        // Case-insensitive comparison
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-Insensitive: Names are equal");
        } else {
            System.out.println("Case-Insensitive: Names are NOT equal");
        }
    }

    public static void main(String[] args) {
        StudentNameComparison obj = new StudentNameComparison();
        obj.compareNames();
    }
}