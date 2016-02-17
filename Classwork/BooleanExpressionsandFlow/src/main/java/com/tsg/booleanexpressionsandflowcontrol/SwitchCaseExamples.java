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
public class SwitchCaseExamples {
    public static void main(String[] args){
        int day = 4;
        String dayName = "";
        
        switch(day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            case 8:
                dayName = "Invalid Day";
        }
        System.out.println(dayName);
        
        String typeOfDay = "";
        
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                typeOfDay = "Weekday";
                break;
            case 6:
            case 7:
                typeOfDay = "Weekend";
            default:
                typeOfDay = "Invalid Day";
        }
        System.out.println(dayName);
    }
}
