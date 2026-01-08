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
// Get a number from user and check weather the given number is a negative or positive number?
public class CheckNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println("Given Numer is Positive");
        }else if(num<0)
        {
             System.out.println("Given Numer is Negative");
        }else{
             System.out.println("Given Numer is Zero");
        }
    
    }
}
