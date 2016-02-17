/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.booleanexpressionsandflowcontrol;

/**
 *
 * @author apprentice
 */
public class BooleanExpressions {
    public static void main(String[] args)
    {
        
        //relational operators
        boolean test1 = 5 == 7;
        System.out.println("Is 5 == 7?" + test1);
        
        int operand1 = 42;
        
        test1 = operand1 != 21;
        
        System.out.println("Is " + operand1 + " != 21? " + test1);
        
        test1 = operand1 < 50;
        test1 = operand1 > 32;
        
        int operand2 = 96;
        test1 = operand2 >= operand1;
        test1 = 75 <= operand2;
        
        //conditional operator
        System.out.println("What is an opposite value of test1?" + !test1);
        
        //toggle the test1
        test1 = !test1;
        
        boolean test2 = false;
        test1 = true;
        
        //result of false && true is false
        boolean result = test1 && test2;
        
        //result of false || true is true
        result = test1 || test2;
        
        // XOR ^ - false ^ true is true;
        result = test1 ^ test2;
        
        
    }
}
