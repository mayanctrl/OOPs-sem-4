package Inheritance.Question_13;

// Q. Design a payment processing system.
// Create an abstract class Payment with an abstract method pay(double amount).
// Create subclasses:
// CreditCardPayment
// UPIPayment
// NetBankingPayment
// Each subclass should implement the pay() method differently.

abstract class Payment {
    abstract void pay(double amount);
}

// Credit Card Payment
class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
    }
}

// UPI Payment
class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}

// Net Banking Payment
class NetBankingPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Processing Net Banking payment of ₹" + amount);
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        p1.pay(1500);
        p2.pay(750);
        p3.pay(2500);
    }
}

/*
 * Sample Output:
 * 
 * Processing Credit Card payment of ₹1500.0
 * Processing UPI payment of ₹750.0
 * Processing Net Banking payment of ₹2500.0
 */