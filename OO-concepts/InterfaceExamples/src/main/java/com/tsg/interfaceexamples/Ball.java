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
public class Ball implements Colorable{

    String color;
    @Override
    public void setColor(String color) {
        System.out.println("Color is set to " + color);
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
    
    public void bounce()
    {
        System.out.println("Bouncing...");
    }
    
}
