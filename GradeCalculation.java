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
//Write a program that takes marks of different subjects and show students grade after calculation?
public class GradeCalculation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your English marks = ");
        int eng = sc.nextInt();
        System.out.print("Enter Computer marks = ");
        int com = sc.nextInt();
        int total = eng+com;
        if(total>=90 && total<100)
        {
            System.out.println("Your Grade is A");
        }else if(total>=80 && total<90){
            System.out.println("Your Grade is B");
        }else{
           System.out.println("You are fail");
        }
    }
}

