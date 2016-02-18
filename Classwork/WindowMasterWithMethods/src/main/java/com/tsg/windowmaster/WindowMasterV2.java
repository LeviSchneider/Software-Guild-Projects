/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.windowmaster;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WindowMasterV2 {

    public static void main(String[] args) {
        //final float TRIM_PRICE = 2.25f;
        //final float GRASS_PRICE = 3.50f;

        final float MAX_HEIGHT = 25.5f;
        final float MAX_WIDTH = 18.75f;
        final float MIN_DIMENSION = 1.0f;

        float height = 0;
        float width = 0;
        float trim = 0;
        float grass = 0;

        height = checkValue(height, MAX_HEIGHT, MIN_DIMENSION, "Please insert height *WARNING* can only take values within 1.0-25.5");

        //while (height > MAX_HEIGHT || height < MIN_DIMENSION) {
        //    height = getUserInput("Please re-enter the window height within range:");
        //}

        width = checkValue(width, MAX_WIDTH, MIN_DIMENSION, "Please insert width *WARNING* can only take values within 1.0-18.75");

        //String stringHeight = "";
        //String stringWidth = "";
        //String stringTrim = "";
        //String stringGrass = "";

        float areaOfWindow = 0;
        float cost = 0;
        float perimeterOfWindow = 0;
        
        trim = 2.25f;
        
        grass = 3.50f;
        // here is the sample declaration
        //String someSampleString = "";
        Scanner sc = new Scanner(System.in);

        //stringTrim = sc.nextLine();
        //System.out.println("Please enter grass price");
        //stringGrass = sc.nextLine();


        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width); // can also do hieght*2 + width *2

        cost = ((grass * areaOfWindow) + (trim * perimeterOfWindow));

        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
    


    public static float getUserInput(String userPrompt) {
        String stringValue = "";
        float value = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(userPrompt);
        stringValue = sc.nextLine();
        value = Float.parseFloat(stringValue);

        return value;
    }
    public static float checkValue(float num, float max, float min, String userInput) {
        do{
            num = getUserInput(userInput);
        }while(num > max || num < min);
        return num;
    }
    
}
