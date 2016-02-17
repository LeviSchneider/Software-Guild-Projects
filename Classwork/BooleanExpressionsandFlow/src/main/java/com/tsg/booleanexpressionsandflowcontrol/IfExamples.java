/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.booleanexpressionsandflowcontrol;

/**
 *
 * @author apprentice
 */
public class IfExamples {
    public static void main(String[] args)
    {
        int numX = 4;
        String dayName = "";
        
        if(numX == 1){
            dayName = "Monday";
        }else if(numX == 2){
            dayName = "Tuesday";
        }else if(numX == 3){
            dayName = "Wednesday";
        }else if(numX == 4){
            dayName = "Thursday";
        }else if(numX == 5){
            dayName = "Friday";
        }else if(numX == 6){
            dayName = "Saturday";
        }else if(numX == 7){
            dayName = "Sunday";
        }else{
            dayName = "Invalid day";
        }
        
        System.out.println(numX);
    }
}
