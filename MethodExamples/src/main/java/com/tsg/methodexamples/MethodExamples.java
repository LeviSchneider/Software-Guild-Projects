/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.methodexamples;

/**
 *
 * @author apprentice
 */
public class MethodExamples {
    
    public static void main(String[] args) {
        doit();
        silly(add(5,6));
        //this call will not store the result of add method
        add(7,22);
        
        //this call will store the result of add
        //int result = add(23,42);
        //result = add(23,0);
        System.out.println("The sum is " + add(10,10));
    }
    
    //this method takes no parameters and returns no values
    public static void doit()
    {
        System.out.println("Hello");
    }
    
    //this method takes no parameters and returns an integer value
    public static int get5()
    {
        return 5;
    }
    
    //takes in a parameter and returns no values
    public static void silly(int i)
    {
        System.out.println("My parameter is:" + i);
    }
    
    //has two parameters and returns the sum of a and b
    public static int add(int a, int b)
    {
        int sum = 0;
        sum = a + b;
        
        //this line can cause divide by 0
        int test = a/b;
        return sum;
    }
}
