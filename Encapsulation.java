/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
// Encapsulation

class Person{
    //public int age;
    //void output(){
       // System.out.println("age= "+ age);
    //}
    
    private int age;
    void setAge(int age)
    {
        this.age = age;
       
    }
    int getAge()
    {
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args)
    {
        Person obj=new Person();
        //obj.age=25;
        //obj.output();
        obj.setAge(24);
        System.out.println(obj.getAge());
    }
    
}
