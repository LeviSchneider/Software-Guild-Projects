package com.tsg.windowmaster;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class WindowMaster {
    public static void main(String[] args){
        //this line won't work since we have declaration below
        //someSampleString = "";
        
        float height = 0;
        float width = 0;
        
        String stringHeight = "";
        String stringWidth = "";
        
        float areaOfWindow = 0;
        float cost = 0;
        float perimeterOfWindow = 0;
        
        //here is the sample declaration
        //String someSampleString = 0;
        
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Please enter window height:");
        stringHeight = sc.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = sc.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);
        
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + cost);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total cost = " + cost);
    }
}
