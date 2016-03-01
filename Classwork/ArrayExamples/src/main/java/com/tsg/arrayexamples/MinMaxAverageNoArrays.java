/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.arrayexamples;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class MinMaxAverageNoArrays {
    public static void main(String[] args) {
        Random rnd = new Random();
        int minValue = 100;
        int maxValue = 0;
        double average = 0;
        
        for(int i = 0; i < 10; i++)
        {
            int value = rnd.nextInt(101);
            if(minValue > value)
            {
                minValue = value;
            }
            if(maxValue < value)
            {
                maxValue = value;
            }
            average += value;
            System.out.println("Current number is: " + value);
        }
        average = average/10;
        
        System.out.println("Min value of 10 random numbers: " + minValue);
        System.out.println("Max value of 10 random numbers: " + maxValue);
        System.out.println("Average value is " + average);
    }
}
