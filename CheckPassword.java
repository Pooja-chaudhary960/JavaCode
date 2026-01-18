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
public class CheckPassword {
    public static void main(String[] args){
        String OriginalPassword = "Ram@123";
       Scanner sc = new Scanner(System.in);
       String userPassword;
       
       do{
           System.out.print("Enter your Password= ");
           userPassword=sc.nextLine();
           if(OriginalPassword.equals(userPassword))
           {
               System.out.println("Correct Password, Welcome");
               break;
           }else{
               System.out.println("Wrong Password, Please Try again");
           }
       }while(true);
    
}
}
