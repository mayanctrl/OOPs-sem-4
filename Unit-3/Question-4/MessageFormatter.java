/*4. Create a class MessageFormatter.
 Accept first name and last name.
 Concatenate both names with space.
 Display full name in proper format.*/
import java.util.Scanner;

class MessageFormatter {

    String firstName, lastName;

    void formatMessage() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        lastName = sc.nextLine();

        // Concatenate with space
        String fullName = firstName + " " + lastName;

        // Display formatted name
        System.out.println("Full Name: " + fullName);
    }

    public static void main(String[] args) {
        MessageFormatter obj = new MessageFormatter();
        obj.formatMessage();
    }
}