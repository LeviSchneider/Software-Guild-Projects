/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.inheritancespecializationexample.employees;

import com.tsg.inheritancespecializationexample.employees.Employee;
/**
 *
 * @author apprentice
 */
public class Manager extends Employee{
    
    private String title;
    
    public Manager(String name, String ssn)
    {
        super(name,ssn);
        title = "GM";
    }
    public void hire()
    {
        System.out.println("Welcome aboard!");
    }
    
    public void fire()
    {
        System.out.println("Your services are no longer required.... Here is your severance pay. It's a bagel, enjoy");
    }
    
    public void givePerformanceReview()
    {
        System.out.println("I'm going to sugar coat this. You're dead weight.");
    }
    
    @Override
    public void collectBonus()
    {
        System.out.println("Collect your 20% of annual pay.");
    }
    
    public void createOnjectives()
    {
        System.out.println("Make everyone work harder!!!");
        super.createObjectives();
    }
}
