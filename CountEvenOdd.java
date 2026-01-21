/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */

//Count Even and Odd Number
public class CountEvenOdd {
    public static void main(String[] args)
    {
        int number[]={1,2,3,4,5,6,7,8,9,10};
        
        int even=0, odd=0;
        
        for(int i=0; i<number.length; i++)
        {
            if(number[i]%2==0)
            {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even= " + even + " Odd = " + odd);
    }
    
}
