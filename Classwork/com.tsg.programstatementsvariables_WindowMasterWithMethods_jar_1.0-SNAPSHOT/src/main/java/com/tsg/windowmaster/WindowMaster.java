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
public class WindowMaster {

    public static void main(String[] args) {

        final float TRIM_PRICE = 2.25f;
        final float GLASS_PRICE = 3.50f;

        final float MAX_HEIGHT = 25.5f;
        final float MAX_WIDTH = 18.75f;
        final float MIN_HEIGHT = 1.0f;
        final float MIN_WIDTH = 1.0f;

        float height;
        float width;

        String stringHeight;
        String stringWidth;

        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        Scanner sc = new Scanner(System.in);
        //---------------------refactor Level 1-------------------------------
        //height = getHeight();
        //---------------------refactor Level 2-------------------------------
        String donkeyLobster = "Please enter window height:";
        height = getUserInput(donkeyLobster);
        //height = Float.parseFloat(stringHeight);
        if (height > MAX_HEIGHT || height < MIN_HEIGHT) {
            System.out.println("Height must be between " + MAX_HEIGHT + " and " + MIN_HEIGHT + ".");
        } else {
            width = getUserInput("Please enter window width:");
            if (width > MAX_WIDTH || width < MIN_WIDTH) {
                System.out.println("Width must be between " + MAX_WIDTH + " and " + MIN_WIDTH + ".");
            } else {
                areaOfWindow = height * width;
                perimeterOfWindow = (height * 2) + (width * 2);
                cost = (perimeterOfWindow * TRIM_PRICE) + (areaOfWindow * GLASS_PRICE);

                System.out.println("Window height = " + height);
                System.out.println("Window width = " + width);
                System.out.println("Window area = " + areaOfWindow);
                System.out.println("Window perimeter = " + perimeterOfWindow);
                System.out.println("Cost = " + cost);
            }
        }
    }

    //This section is the code we used to use but it was double the size we required it to be.
    /*
    public static float getHeight() {

        String stringHeight = "";
        float height = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter window height:");
        stringHeight = sc.nextLine();
        height = Float.parseFloat(stringHeight);

        return height;
    }

    public static float getWidth() {
        String stringWidth = "";
        float width = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter window width in decimal feet: ");
        stringWidth = sc.nextLine();
        width = Float.parseFloat(stringWidth);

        return width;
    }
    */

    public static float getUserInput(String userPrompt) {
        String stringValue = "";
        float value = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(userPrompt);
        stringValue = sc.nextLine();
        value = Float.parseFloat(stringValue);
        
        return value;
    }
}
