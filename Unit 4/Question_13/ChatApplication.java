class ChatApplication {

    public static void main(String[] args) {

        // Sending thread
        Runnable sender = new Runnable() {
            public void run() {
                System.out.println("Sending message...");
                try {
                    Thread.sleep(1000); // simulate delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Message sent");
            }
        };

        // Receiving thread
        Runnable receiver = new Runnable() {
            public void run() {
                System.out.println("Receiving message...");
                try {
                    Thread.sleep(1500); // simulate delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Message received");
            }
        };

        // Create threads
        Thread t1 = new Thread(sender);
        Thread t2 = new Thread(receiver);

        // Thread lifecycle demonstration
        System.out.println("Thread State before start: " + t1.getState());

        t1.start();
        t2.start();

        System.out.println("Thread State after start: " + t1.getState());

        try {
            t1.join(); // wait for sender to finish
            t2.join(); // wait for receiver to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread State after completion: " + t1.getState());
    }
}