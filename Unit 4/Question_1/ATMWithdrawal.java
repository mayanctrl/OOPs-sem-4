/*11. ATM Withdrawal System
Create a class ATMWithdrawal. Accept account balance and

withdrawal amount from the user. If withdrawal amount is
greater than balance, throw an exception manually using throw.
Otherwise deduct amount and display updated balance.
Output: If sufficient balance: &#39;Withdrawal successful.
Remaining balance: &lt;balance&gt;&#39; Else: &#39;Insufficient Balance&#39;*/

import java.util.Scanner;

class ATMWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            // Check condition and throw exception manually
            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            }

            // Deduct amount
            balance = balance - amount;

            System.out.println("Withdrawal successful. Remaining balance: " + balance);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}