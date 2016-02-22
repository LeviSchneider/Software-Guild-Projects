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
public class AreTheyTrue {
    public static void main(String[] args) {
        System.out.println(howTrue(true, true));
        System.out.println(howTrue(false, false));
        System.out.println(howTrue(true, false));
        System.out.println(howTrue(false, true));
    }
    public static boolean howTrue(boolean a, boolean b)
    {
        if(a == true && b == true)
        {
            System.out.println(a + " and " + b + " " + "BOTH");
        }
        else if(a == false && b == false)
        {
            System.out.println(a + " and " + b + " " + "NEITHER");
        }
        else 
        {
            System.out.println(a + " and " + b + " " + "ONLY ONE");
        }
        return b;
    }
}
