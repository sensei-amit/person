class Person {
    // Instance variables
    String name;
    int age;
    String city;

    // Constructor
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

