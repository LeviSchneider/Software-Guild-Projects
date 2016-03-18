/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.lambdasandstreamexamples;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        
        final String testValue = "print me when you run away";
        
        FooInterface foo = new FooInterface(){
            @Override
            public String fight() {
                return "I am a magical anonymous class";
            }

            @Override
            public void flee() {
                System.out.println(testValue);
                
            }
        };
        
        runFoo(foo);
    }
    
    public static void runFoo(FooInterface test)
    {
        System.out.println(test.fight());
        test.flee();
    }
    
}
