// Question 3: Define a class CARRENTAL with the following details:
// Class Members are: CarId of int type, CarType of string type and Rent of float type.
// Define GetCar() method which accepts CarId and CarType.
// GetRent() method which return rent of the car on the basis of car type,
// i.e. Small Car = 1000, Van = 800, SUV = 2500
// ShowCar() method which allow user to view the contents of cars i.e. id, type and rent.

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int CarId, String CarType) {
        this.CarId = CarId;
        this.CarType = CarType;
        this.Rent = GetRent();
    }

    @Override
    public String toString() {
        return "Car ID: " + CarId + " | Car Type: " + CarType + " | Rent: " + Rent;
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            return 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            return 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            return 2500;
        } else {
            return 0;
        }
    }

    void ShowCar() {
        System.out.println("----------------------------");
        System.out.println("Car ID   : " + CarId);
        System.out.println("Car Type : " + CarType);
        System.out.println("Rent     : " + Rent);
        System.out.println("----------------------------");
    }
}

public class main {
    public static void main(String[] args) {

        CARRENTAL car1 = new CARRENTAL();
        car1.GetCar(101, "Small Car");
        car1.ShowCar();

        CARRENTAL car2 = new CARRENTAL();
        car2.GetCar(102, "Van");
        car2.ShowCar();

        CARRENTAL car3 = new CARRENTAL();
        car3.GetCar(103, "SUV");
        car3.ShowCar();

    }
}

// Output:
// ----------------------------
// Car ID : 101
// Car Type : Small Car
// Rent : 1000.0
// ----------------------------
// ----------------------------
// Car ID : 102
// Car Type : Van
// Rent : 800.0
// ----------------------------
// ----------------------------
// Car ID : 103
// Car Type : SUV
// Rent : 2500.0
// ----------------------------