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
public class UserInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n1 = sc.nextInt();
        System.out.println("Enter another number = ");
        int n2 = sc.nextInt();
        int sum =n1+n2;
        System.out.println("Sum = " + sum);

        
    }
}
