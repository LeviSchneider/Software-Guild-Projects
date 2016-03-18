/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.interfaceexamples;

/**
 *
 * @author apprentice
 */
public class MyDebugLogger implements DebugLogging, Colorable{

    @Override
    public void displayStatus(String id) {
        System.out.println("Id of status going into file " + id);
    }

    @Override
    public void displayError(String error) {
        System.out.println("Error going into file " + error);
    }

    @Override
    public void logStatus(String id) {
        System.out.println("Status id: " + id + " still means nothing to me.");
    }

    @Override
    public void logError(String error) {
        System.out.println("Things broke!! A-A-A-A-A-A!!! " + error);
    }

    @Override
    public void setColor(String color) {
        System.out.println("Isn't purple pretty? This color is nice too: " + color);
    }

    @Override
    public String getColor() {
        return "purple";
    }
    
}
