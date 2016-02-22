/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.javabasics;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WhatIsYourNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        System.out.println("Please print an integer: ");
        number = sc.nextInt();
        
        for(int i = 0; i < number; i++)
        {
            System.out.println(i);
        }
        System.out.println("Thank you for playing!");
    }
}
