/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.javabasics;

import static java.util.Date.parse;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Adder {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        add(1,1);
        add(2,3);
        add(5,8);
        add(95,42); 
    }
    public static int add(int num1, int num2)
    {
        int sum = num1 + num2;
        
        System.out.println(num1 + " and " + num2 + " = " + sum);
        return sum;
    }
}
