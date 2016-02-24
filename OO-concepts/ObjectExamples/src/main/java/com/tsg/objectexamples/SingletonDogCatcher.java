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
public class SingletonDogCatcher {
    
    private static SingletonDogCatcher instance;
    
    private int numberOfDogsCaught = 0;
    
    private SingletonDogCatcher()
    {
        
    }
    
    public static SingletonDogCatcher Instance()
    {
        if(instance == null)
        {
            instance = new SingletonDogCatcher();
        }
        return instance;
    }
    
    public String catchDog(Dog dog)
    {
        numberOfDogsCaught++;
        return dog.getDogName();
    }
}
