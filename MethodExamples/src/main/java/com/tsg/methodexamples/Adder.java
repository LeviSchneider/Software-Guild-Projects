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
public class Adder {
    public static void main(String[] args) {
        int sum = addIntegers(12, 15);
        displayResult("Excellent work, the sum is", sum);
    }
    public static int add0and1()
    {
        return 0+1;
    }
    public static int add1and1()
    {
        return 1+1;
    }
    public static int add1and2()
    {
        return 1+2;
    }
    public static int addIntegers(int operand1, int operand2)
    {
        return operand1+operand2;
    }
    public static void displayResult(String prompt, int result)
    {
        System.out.println(prompt + " " + result);
    }
}
