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
// Get a number from user as a input and check weather the given number is Even or Odd?
public class CheckEvenOdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Given number is Even");
        }else{
             System.out.println("Given number is Odd");
        }
    }
}
