/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.arrayexamples;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MinMaxAverageWithArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];
        int userInput = 0;
        int minValue = 0;
        int maxValue = 0;
        double average = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter a number (" +(i+1)+" of " + numbers.length + "):");
            userInput = sc.nextInt();
            numbers[i] = userInput;
        }
        minValue = maxValue = numbers[0];
        
        for(int number : numbers)
        {
//            if(number > maxValue)
//            {
//                maxValue = number;
//            }
            //means the same thing as the commented code above.
            maxValue = (number > maxValue)?number:maxValue;
            
//            if(number < minValue)
//            {
//                minValue = number;
//            }
            //means the same thing as the commented code above. COOL!
            minValue = (number < minValue)?number:minValue;
            
            average += number;
        }
        average = average/numbers.length;
        
        System.out.println("Min value of 10 random numbers: " + minValue);
        System.out.println("Max value of 10 random numbers: " + maxValue);
        System.out.println("Average value is " + average);
    }
}
