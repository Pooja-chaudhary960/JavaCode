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
//Write a program to check the given letter is a vowel or not by using switch statement.
public class SwitchStatement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a letter : ");
        char value = sc.next().charAt(0);
        
        switch(value)
        {
            case 'a' :
                 System.out.println("This is a vowel letter a");
                 break;
             case 'e' :
                 System.out.println("This is a vowel letter e");
                 break;
               case 'i' :
                 System.out.println("This is a vowel letter i");
                 break;
                 case 'o' :
                 System.out.println("This is a vowel letter o");
                 break;
                 case 'u' :
                 System.out.println("This is a vowel letter u");
                 break;
                 
                 default:
                     System.out.println("This is not a vowel");
                 
        }
    }
}
