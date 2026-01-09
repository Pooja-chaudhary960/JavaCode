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
// Print the sum of first n natural numbers.
public class SumNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        int sum=0;
        for(int i=0; i<=number; i++)
        {
            sum = sum+i;
        }
        System.out.println("sum = " + sum);
    }
}
