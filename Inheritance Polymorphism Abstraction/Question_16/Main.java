package Inheritance.Question_16;

// Q. A hospital manages different types of staff.
// Create a base class Staff with method work().
// Create subclasses:
// Doctor
// Nurse
// Receptionist
// Override work() to display different responsibilities.

class Staff {
    void work() {
        System.out.println("Staff member is working.");
    }
}

// Doctor class
class Doctor extends Staff {
    @Override
    void work() {
        System.out.println("Doctor is diagnosing and treating patients.");
    }
}

// Nurse class
class Nurse extends Staff {
    @Override
    void work() {
        System.out.println("Nurse is assisting doctors and caring for patients.");
    }
}

// Receptionist class
class Receptionist extends Staff {
    @Override
    void work() {
        System.out.println("Receptionist is managing appointments and patient records.");
    }
}

public class Main {
    public static void main(String[] args) {

        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        // Runtime Polymorphism
        s1.work();
        s2.work();
        s3.work();
    }
}

/*
 * Sample Output:
 * 
 * Doctor is diagnosing and treating patients.
 * Nurse is assisting doctors and caring for patients.
 * Receptionist is managing appointments and patient records.
 */
