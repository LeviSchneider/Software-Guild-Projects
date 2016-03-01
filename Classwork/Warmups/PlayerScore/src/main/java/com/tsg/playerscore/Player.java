/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.playerscore;

/**
 *
 * @author apprentice
 */
public class Player {
    private double points;
    private String name; 

    public Player(String name, double points)
    {
        this.name = name;
        this.points = points;
    }
    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
