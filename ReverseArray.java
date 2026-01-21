/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.Arrays;

/**
 *
 * @author Acer
 */
//Reverse the Array

public class ReverseArray {
    public static void main(String[] args)
    {
        int number[]= {10,5,30,40,15,35};
        int start=0, end=number.length-1;
        
        while(start<end)
        {
            int temp=number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }
        System.out.print("Reverse Array: "+ Arrays.toString(number));
    }
    
    
}
