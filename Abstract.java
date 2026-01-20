/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */

abstract class School {
    abstract void displayOutput();
}

class College extends School {
    public void displayOutput() {
        System.out.println("Child class");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Creating an object of the College class, since Student is not defined
        College s = new College();
        s.displayOutput();  // It will print "Child class"
    }
}