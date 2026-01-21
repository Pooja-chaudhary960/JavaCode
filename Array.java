/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
public class Array {
    public static void main(String[] args)
    {
        //How to create array
        //int age[]={21,22,23,24,25};
        
         // How to change
        //age[2]=30;
        
        //How to access
        //System.out.println(age[2]);
        
        //for loop
       /*for(int i=0; i<5; i++)
       {
           System.out.println(age[i]);
       }*/
       
       //For each loop
      /* for(int i: age)
       {
           System.out.println(i);
       }*/
        
        int age[]=new int[5];
        //How to insert
        age[0]=25;
        age[1]=26;
        for(int i: age)
        {
            System.out.println(i);
        }
    }
}
