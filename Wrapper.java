/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
public class Wrapper {
    public static void main(String[] args)
    {
        int a=25;
        Integer i = Integer.valueOf(a);
       // Integer j=a; // autoboxing
        //int c = i; //unboxing
        System.out.println("Primitive = " +a);
        System.out.println("Wrapper class = " + i);
    }
}
