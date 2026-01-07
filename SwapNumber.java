/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
// Write a Java Program to swap two numbers without using a temporary variable.
public class SwapNumber {
    public static void main(String[] agrs)
    {
        int num1, num2;
        num1=10;
        num2=20;
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("Num1 :" + num1 + "Num2:" + num2);
    }
}
