/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
// Calculate the sum of all element
public class SumElement {
    public static void main(String[] args)
    {
        int number[]={10,5,20,30,40};
        int Sum=0;
        for(int i=0; i<number.length; i++)
        {
            Sum +=number[i];
        }
        System.out.println("Sum: " + Sum);
    }
}
