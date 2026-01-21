/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
//Find Index of a given Element

public class SearchIndex {
    public static void main(String[] args)
    {
        int number[]={10,5,30,40,15,35};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int target = sc.nextInt();
        int index = -1;
        
        for(int i=0; i<number.length; i++)
        {
            if(number[i]==target)
            {
                index=i;
                break;
            }
        }
        System.out.print("Index of " +target+" is : " + index);
    }
    
}
