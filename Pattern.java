/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
// Draw this pattern using nested for loop.
public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) { 
                System.out.print(" * ");  // Use print() to avoid newline after each star
            }
            System.out.println();  // Moves to the next line after each row
        }
    }
}
