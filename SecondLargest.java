/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
//Find second Largest Element

public class SecondLargest {
    public static void main(String[] args)
    {
        int number[] = {10,5,30,40,15,35};
        
        int first= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int i: number)
        {
            if(i>first)
            {
                second=first;
                first=i;
            }else if(i>second && i!=first)
            {
                second=i;
            }
        }
        System.out.println("First = "+ first+ "Second = " + second);
    }
}
