/*18. Railway Reservation System

Create a class RailwayReservation. Use synchronization to
avoid double booking.
Output: &#39;Ticket booked successfully&#39; or &#39;No tickets available&#39;*/
class RailwayReservation {

    int tickets = 1; // available tickets

    // synchronized method
    synchronized void bookTicket(String name) {

        if (tickets > 0) {
            System.out.println(name + ": Ticket booked successfully");
            tickets--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }
}

class Passenger extends Thread {

    RailwayReservation rr;
    String name;

    Passenger(RailwayReservation rr, String name) {
        this.rr = rr;
        this.name = name;
    }

    public void run() {
        rr.bookTicket(name);
    }
}

public class Main {
    public static void main(String[] args) {

        RailwayReservation rr = new RailwayReservation();

        Passenger p1 = new Passenger(rr, "User1");
        Passenger p2 = new Passenger(rr, "User2");

        p1.start();
        p2.start();
    }
}