/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.objectexamples;

/**
 *
 * @author apprentice
 */
public class Dog {  
    private String furColor;
    private String breed;
    private String dogName;
    private int age;
    private float weight;
    private boolean isAlive;
    
    public Dog(String dogName, int age, float weight)
    {
        this.dogName = dogName;
        this.weight = weight;
        this.age = age;
        isAlive = true;
    }
    
    public String getDogName()
    {
        return dogName;
    }
    
    public void setDogName(String dogName)
    {
        this.dogName = dogName;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public float getWeight()
    {
        return weight;
    }
    
    public void setWeight(float weight)
    {
        this.weight = weight;
    }
    
    public void bark()
    {
        System.out.println("WOOF!!");
    }
    
    public void sit()
    {
        System.out.println("Sitting...");
    }
    
    
}

