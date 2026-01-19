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
public class WhileLoop {
    public static void main(String[] args)
    {
        /*int i =1;
        while(i<=10)
        {
            System.out.println("Hello Ram");
            i++;
        }     */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number= ");
        int value = sc.nextInt();
        int i =1;
        while(i<=10)
        {
            System.out.println(value+"X"+i+"="+value*i);
        }

    }
}
