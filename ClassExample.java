/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
class Person {
    String Name;
    int age;
    void input(String n, int a)
    {
        Name = n;
        age = a;
    }
    void output()
    {
        System.out.println("Name = " + Name);
        System.out.print("Age = " + age);
    }
}
public class ClassExample{
public static void main(String[] args)
{
    Person p1 = new Person();
    p1.input("Ram", 25);
    p1.output();
}
}
