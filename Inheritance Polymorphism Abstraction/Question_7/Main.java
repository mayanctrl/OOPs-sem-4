package Inheritance.Question_7;

// Q. A ride booking application supports different types of rides. Each ride calculates
// fare differently.
// Create an abstract class Ride with:
// distance
// abstract method calculateFare()
// Create subclasses:
// BikeRide → fare = ₹5 per km
// AutoRide → fare = ₹8 per km
// CarRide → fare = ₹12 per km
// Store different rides in a Ride array and calculate fares using runtime polymorphism.

abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

// BikeRide class
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 5;
    }
}

// AutoRide class
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 8;
    }
}

// CarRide class
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 12;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating array of Ride objects
        Ride[] rides = new Ride[3];

        rides[0] = new BikeRide(10);
        rides[1] = new AutoRide(10);
        rides[2] = new CarRide(10);

        // Runtime Polymorphism
        for (int i = 0; i < rides.length; i++) {
            System.out.println("Fare: ₹" + rides[i].calculateFare());
        }
    }
}

/*
 * Sample Output:
 * 
 * Fare: ₹50.0
 * Fare: ₹80.0
 * Fare: ₹120.0
 */