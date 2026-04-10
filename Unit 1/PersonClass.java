class PersonClass {
    String name;
    int age;

    // Constructor to set attributes
    public PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating two Person objects
        PersonClass p1 = new PersonClass("Alice", 25);
        PersonClass p2 = new PersonClass("Bob", 30);

        // Printing details
        p1.display();
        p2.display();
    }
}