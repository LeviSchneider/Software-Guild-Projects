/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.inheritancespecializationexample;

import com.tsg.inheritancespecializationexample.employees.Employee;
import com.tsg.inheritancespecializationexample.employees.Manager;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {

        Employee someGuy = new Employee();

        someGuy.doWork();
        someGuy.createObjectives();
        someGuy.collectBonus();
        
        Employee boss = new Manager("Dat Guy", "324234");
        
        boss.doWork();
        boss.createObjectives();
        boss.collectBonus();
        boss.setName("Sir Morgan Freeman");
       
        
        ((Manager)boss).fire();
        ((Manager)boss).hire();        
        ((Manager)boss).givePerformanceReview();
    }
}
