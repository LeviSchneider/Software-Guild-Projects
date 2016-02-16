/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.programstatementsvariables;

/**
 *
 * @author apprentice
 */
public class ExpressionsExample {
    public static void main(String[] args) 
    {
        
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        result = 0;
        
        operand1 = 5;
        operand2 = 7;
        
        operand3 = operand2;
        
        result = 43 + 53;
        
        result = operand1 + operand2;
        
        result = 1 + operand1;
        
        result = 1 + operand1 + operand2 + operand3;
        result = 2;
        result += 4;
        
        //stuff
        result = 9 - 5;
        
        result = operand1 - operand2;
        
        result = 15 - operand1 - operand2 - operand3;
        
        result = 2; 
        result -= 4;
        result -= operand1;
        
        //more stuff
        result = 2*3;
        result = operand1 * operand2;
        result = 2 * operand1;
        result = 2 * operand1 * operand2 * operand3;
        
        result = 2;
        result *= 4;
        result *= operand1;
        
        result = 6 /3;
        result = operand1 / operand2;
        
        result = operand3 % operand2;
        
        System.out.println(result);
    }
}
