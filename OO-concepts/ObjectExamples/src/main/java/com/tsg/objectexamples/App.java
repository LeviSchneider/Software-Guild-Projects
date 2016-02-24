/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.objectexamples;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your dog's name: ");
        String name = sc.nextLine();
        
        Dog myPuppy = new Dog(name, 5, 10);
        
        myPuppy.setDogName("Yeller");
        
        Dog sameDogDifferentVariable = myPuppy;
        
        sameDogDifferentVariable.setWeight(23.7f);
        
        myPuppy.bark();
        
        myPuppy.setWeight(120.23f);
        
        SingletonDogCatcher catcher = SingletonDogCatcher.Instance();
        
        catcher.catchDog(myPuppy);
        
        Dog poorDog = new Dog("Rex", 12, 15);
        
        OtherMethod(poorDog);
    }
    
    public static void OtherMethod(Dog anotherDog)
    {
        System.out.println("The dogs name is: " + anotherDog.getDogName());
        System.out.println("The dog's age is: " + anotherDog.getAge());
        
        SingletonDogCatcher otherCatcher = SingletonDogCatcher.Instance();
        
        String whoDidWeCatch = otherCatcher.catchDog(anotherDog);
    }
}
