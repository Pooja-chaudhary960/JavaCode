/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Acer
 */
public class GuessingNumber {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int numberToGuess = ran.nextInt(100) + 1;
        int guess;
        do{
            System.out.print("Guess a number = ");
            guess = sc.nextInt();
            if(numberToGuess==guess)
            {
                System.out.print("Congratulations you are won !");
                break;
            }else if(guess<numberToGuess)
            {
                System.out.print("Too Low");
            }else if(guess > numberToGuess)
            {
                  System.out.print("Too High");
            }
        }while(true);
    }
}

