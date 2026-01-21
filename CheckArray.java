/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
// Check If Array is sorted (Ascending)
public class CheckArray {
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5};
        boolean sorted = true;

        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println("Is the array sorted? " + sorted);
    }
}
