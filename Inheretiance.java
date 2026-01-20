/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
// Inheritance

class Student{
    String name;
    int age;
    void output(){
        System.out.println("Name = " +name);
        System.out.println("Age = " +age);
    }
}
class Teacher extends Student{

}
public class Inheretiance {
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher();
        t1.name="Rohan";
        t1.age=25;
        t1.output();
    }
}
