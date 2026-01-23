/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Acer
 */
// Find Majority Element

public class MajorityElement {
    public static void main(String[] args)
    {
        int number[]={1,5,1,3,2,1,8,1,1};
        int n = number.length;
        int count=0;
        int cand=0;
        for(int i=0; i<n; i++)
        {
            if(count==0)
            {
                cand=number[i];
            }
            if(cand==number[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        System.out.println("Majority Element: "+ cand);
    }
}
