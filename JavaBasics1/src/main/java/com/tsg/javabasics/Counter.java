/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.javabasics;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Counter {
    public static void main(String[] args) {
        System.out.println(to10());
        System.out.println(toN(3));
        System.out.println(toN(8));
        System.out.println(toN(200));
    }
    public static int to10()
    {
        int number = 0;
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
            number = i;
        }  
        return number;
    }
    public static int toN(int choice)
    {
        int number = 0;
        for(int i = 1; i < choice; i++)
        {
            System.out.println(i);
        }
        return number;
    }
}
