/*21. Producer Consumer System

Create a class Restaurant. Chef prepares food and waiter serves
it using wait() and notify().
Output: &#39;Chef prepared food&#39; and &#39;Waiter served food&#39;*/
class Restaurant {

    boolean foodReady = false;

    // Chef prepares food (Producer)
    synchronized void prepareFood() {
        try {
            while (foodReady) {
                wait(); // wait if food is already prepared
            }
            System.out.println("Chef prepared food");
            foodReady = true;
            notify(); // notify waiter
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Waiter serves food (Consumer)
    synchronized void serveFood() {
        try {
            while (!foodReady) {
                wait(); // wait if food is not ready
            }
            System.out.println("Waiter served food");
            foodReady = false;
            notify(); // notify chef
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Chef extends Thread {
    Restaurant r;

    Chef(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.prepareFood();
    }
}

class Waiter extends Thread {
    Restaurant r;

    Waiter(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.serveFood();
    }
}

public class Main {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Chef chef = new Chef(r);
        Waiter waiter = new Waiter(r);

        chef.start();
        waiter.start();
    }
}