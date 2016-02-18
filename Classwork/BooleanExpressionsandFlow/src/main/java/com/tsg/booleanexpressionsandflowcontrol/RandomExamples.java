/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.booleanexpressionsandflowcontrol;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class RandomExamples {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        //this will generate random values in range between 1 and 10;

        for (int i = 0; i < 10; i++) {
            int rInt = randomGenerator.nextInt(10) + 1;
            System.out.println("A random number " + (randomGenerator.nextInt(10) + 1));
            System.out.println("What does rInt have to say " + rInt);
        }
    }
}
