/*15. Bank Application
Create a class BankApplication. Define method that throws
exception using throws. Call method in main and handle
exception.
Output: &#39;Transaction processed&#39; or &#39;Exception handled in main&#39;*/
class BankApplication {

    // Method that throws exception
    static void processTransaction(int amount) throws Exception {

        if (amount > 5000) {
            throw new Exception("Limit exceeded");
        }

        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {

        try {
            // Call method
            processTransaction(6000);  // you can change value for testing
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}