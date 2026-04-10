package Question_5;

// Question 5: Define a class employee with the following specification:
// Members are: empno of type integer, ename of type String, basic, hr and da
// are of type float, netpay of type float.
// Member functions:
// Calculate() : A function to find basic+hra+da with the float return type.
// havedata(): function to accept values for empno, ename, basic, hra, da and
// invoke calculate() to calculate netpay.
// dispdata(): function to display all the data members.

import java.util.Scanner;

class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number : ");
        empno = sc.nextInt();
        System.out.print("Enter Employee Name   : ");
        ename = sc.next();
        System.out.print("Enter Basic Salary    : ");
        basic = sc.nextFloat();
        System.out.print("Enter HRA             : ");
        hra = sc.nextFloat();
        System.out.print("Enter DA              : ");
        da = sc.nextFloat();

        // Calling Calculate() to set netpay
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println("==============================");
        System.out.println("Employee Number  : " + empno);
        System.out.println("Employee Name    : " + ename);
        System.out.println("Basic Salary     : " + basic);
        System.out.println("HRA              : " + hra);
        System.out.println("DA               : " + da);
        System.out.println("Net Pay          : " + netpay);
        System.out.println("==============================");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();

        // Taking input from user
        emp.havedata();

        // Displaying all employee details
        emp.dispdata();

    }
}
// ===================== SAMPLE OUTPUT 1 =====================
// (Normal employee salary calculation)

// Enter Employee Number : 1001
// Enter Employee Name : John
// Enter Basic Salary : 20000
// Enter HRA : 5000
// Enter DA : 3000

// ==============================
// Employee Number : 1001
// Employee Name : John
// Basic Salary : 20000.0
// HRA : 5000.0
// DA : 3000.0
// Net Pay : 28000.0 ← (20000 + 5000 + 3000 = 28000)
// ==============================

// ===================== SAMPLE OUTPUT 2 =====================
// (Another employee with different salary components)

// Enter Employee Number : 1002
// Enter Employee Name : Sara
// Enter Basic Salary : 35000
// Enter HRA : 8000
// Enter DA : 4500

// ==============================
// Employee Number : 1002
// Employee Name : Sara
// Basic Salary : 35000.0
// HRA : 8000.0
// DA : 4500.0
// Net Pay : 47500.0 ← (35000 + 8000 + 4500 = 47500)
// ==============================
