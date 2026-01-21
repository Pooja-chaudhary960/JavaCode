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
public class ArrayExample {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Students do you want to add = ");
        int Size= sc.nextInt();
        int age[]=new int[Size];
        for(int i=0; i<Size; i++)
        {
            age[i]=sc.nextInt();
            
        }
        System.out.println("Student's list");
        
        //for(int i:age)
       // {
          //  System.out.println(i);
        //}
    }
}
