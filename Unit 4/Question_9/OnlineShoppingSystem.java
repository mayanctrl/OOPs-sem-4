/*19. Online Shopping System
Create a class OnlineShoppingSystem. Create threads for
payment and order processing.
Output: &#39;Processing payment...&#39; and &#39;Order confirmed...&#39;*/
class OnlineShoppingSystem {

    public static void main(String[] args) {

        // Payment thread using Runnable
        Runnable payment = new Runnable() {
            public void run() {
                System.out.println("Processing payment...");
            }
        };

        // Order processing thread using Runnable
        Runnable order = new Runnable() {
            public void run() {
                System.out.println("Order confirmed...");
            }
        };

        // Create threads
        Thread t1 = new Thread(payment);
        Thread t2 = new Thread(order);

        // Start threads
        t1.start();
        t2.start();
    }
}