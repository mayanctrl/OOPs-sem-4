/*10. Create a class PasswordMaskingSystem.
 Accept password from the user.
 Replace all characters except last two using replace()
method.
 Display masked password.*/

import java.util.Scanner;

class PasswordMaskingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() > 2) {

            // Mask all characters except last two
            String maskedPart = password.substring(0, password.length() - 2)
                                        .replaceAll(".", "*");

            String lastTwo = password.substring(password.length() - 2);

            String result = maskedPart + lastTwo;

            System.out.println("Masked Password: " + result);

        } else {
            System.out.println("Password too short to mask");
        }
    }
}