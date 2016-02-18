/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.booleanexpressionsandflowcontrol;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DoWhileAndWhileLoops {

    public static void main(String[] args) {
        System.out.println("User must get it right wiht do while loops.");

        Scanner sc = new Scanner(System.in);

        int userValue = 0;

        do {
            System.out.println("Please enter value between 1 and 5 inclusive");

            String userInput = sc.nextLine();
            userValue = Integer.parseInt(userInput);

        } while (userValue < 1 || userValue > 5);

        System.out.println("Excellent, thank you for being within range");

        System.out.println("User must get it right with while loops");

        int otherValue = 0;
        System.out.println("Please enter another value between 3 and 10:");
        //cannot use this variable as it was declared inside do while loop
        //userInput + "";

        String otherInput = sc.nextLine();

        while (userValue < 3 || userValue > 10) {
            System.out.println("Please pay attention to the range [3:10]:");
            otherInput = sc.nextLine();
            otherValue = Integer.parseInt(otherInput);
        }
    }
}
