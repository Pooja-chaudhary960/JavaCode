/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
// Complie time Polymorphism(Method Overloading)

class A {
    int age;
    String name;
    
    void show(int a) {
        age = a;
        System.out.println("Age = " + age);
    }
}

class B extends A {
    
    // Overloaded method in class B
    void show(int a, String n) {
        age = a;
        name = n;
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
    }
}

public class OverloadingMethod {
    public static void main(String[] args) {
        B obj = new B();
        
        // Calling the inherited method
        obj.show(25);
        
        // Calling the overloaded method in class B
        obj.show(25, "Ram");
    }
}
