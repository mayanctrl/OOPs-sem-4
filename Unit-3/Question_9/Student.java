/*9. Define a class Student with attributes id and name.

 Override toString() method.
 Create object of class.
 Display object details using toString().*/

class Student {

    int id;
    String name;

    // Constructor to initialize values
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student(101, "Darshan");

        // Displaying object (calls toString() automatically)
        System.out.println(s1.toString());
    }
}