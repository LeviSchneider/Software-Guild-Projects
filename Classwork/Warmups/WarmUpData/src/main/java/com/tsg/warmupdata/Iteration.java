/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.warmupdata;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class Iteration {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        
        teams.add("Vikings");
        teams.add("Packers");
        teams.add("Lions");
        teams.add("Bears");
        teams.add("Browns");
        teams.add("Bengals");
        teams.add("Steelers");
        teams.add("Ravens");
        
        for(String nm: teams)
        {
            System.out.println(nm);
        }
        System.out.println(" ");
        
        String[] array1 = teams.toArray(new String[teams.size()]);
        
        for(int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);
        }
        System.out.println(" ");
        
        Iterator itr = teams.listIterator();
        while(itr.hasNext())
        {
            Object teamsList = itr.next();
            System.out.println(teamsList + " ");
        }
    }
}
