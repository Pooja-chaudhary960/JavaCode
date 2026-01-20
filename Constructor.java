package com.mycompany.main;

// This is a non-public class Person inside the same file
class People {
    String name;
    int age;

    // Default constructor
    People() {
        name = "Ram";
        age = 25;
    }

    // Method to display name and age
    void output() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Create an instance of the Person class
        People p1 = new People();
        p1.output();  // Display the output using the output method
    }
}
