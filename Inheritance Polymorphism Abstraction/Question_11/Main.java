package Inheritance.Question_11;

// Q10. Create an interface Bank with method getInterestRate().
// Create classes SBI, HDFC, and ICICI that implement the interface
// and return different interest rates.
// Write a Java program to display the interest rate of each bank.

interface Bank {
    double getInterestRate();
}

// SBI class
class SBI implements Bank {
    @Override
    public double getInterestRate() {
        return 6.5;
    }
}

// HDFC class
class HDFC implements Bank {
    @Override
    public double getInterestRate() {
        return 7.0;
    }
}

// ICICI class
class ICICI implements Bank {
    @Override
    public double getInterestRate() {
        return 6.8;
    }
}

public class Main {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate() + "%");
    }
}

/*
 * Sample Output:
 * 
 * SBI Interest Rate: 6.5%
 * HDFC Interest Rate: 7.0%
 * ICICI Interest Rate: 6.8%
 */
