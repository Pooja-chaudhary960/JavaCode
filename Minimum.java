/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
// Find the minimum Element
public class Minimum {
     public static void main(String[] args)
    {
        int number[]={10,5,30,40,20,31};
        int min= number[0];
        for(int i=1; i<number.length; i++)
        {
            if(min>number[i])
            {
                min=number[i];
            }
        }
        System.out.println("Max Element = " + min);
    }
}
