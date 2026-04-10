/*22. Banking System
Create a class BankingSystem. Multiple threads access shared
account balance using synchronized block.
Output: Balance deduction messages.*/
class BankingSystem {

    int balance = 1000; // shared account balance

    void withdraw(String name, int amount) {

        synchronized (this) { // synchronized block

            if (balance >= amount) {
                System.out.println(name + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(name + ": Insufficient balance");
            }
        }
    }
}

class Customer extends Thread {

    BankingSystem bs;
    String name;
    int amount;

    Customer(BankingSystem bs, String name, int amount) {
        this.bs = bs;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        bs.withdraw(name, amount);
    }
}

public class Main {
    public static void main(String[] args) {

        BankingSystem bs = new BankingSystem();

        // Multiple threads accessing same account
        Customer c1 = new Customer(bs, "User1", 700);
        Customer c2 = new Customer(bs, "User2", 500);

        c1.start();
        c2.start();
    }
}