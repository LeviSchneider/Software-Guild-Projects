/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.inheritancespecializationexample.employees;

import com.tsg.inheritancespecializationexample.employees.Manager;
/**
 *
 * @author apprentice
 */
public class Employee {
    private String name;
    private String ssn;
    
    public Employee()
    {
        name = "Jane Doe";
        ssn = "999-99-9999";
    }
    
    public Employee(String name, String ssn)
    {
        this.name = name;
        this.ssn = ssn;
    }

    public void doWork()
    {
        System.out.println("I am working really hard.... JK");
    }
    
    public void createObjectives()
    {
        System.out.println("Eat more sandwitches by monday! Stat!");
    }
    
    public void collectBonus()
    {
        System.out.println("Collect 10% of your pay.");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
