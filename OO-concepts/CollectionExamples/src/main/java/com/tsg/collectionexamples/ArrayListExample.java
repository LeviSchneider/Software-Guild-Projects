/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<String> stringList = new ArrayList<>();
        
        System.out.println("List size before adding any Strings: " + stringList.size());
        
        stringList.add("My First String");
        
        System.out.println("List size after adding one Strings: " + stringList.size());
        
        stringList.add("My Second String");
        
        System.out.println("List size after adding two Strings: " + stringList.size());
        
        stringList.add("My Third String");
        
        
        printStringList(stringList);
        
        printStringListWithWhile(stringList);
        stringList.remove(1);
        System.out.println("===================================");
        printStringList(stringList);
        
        stringList.remove(1);
        System.out.println("===================================");
        printStringList(stringList);
    }
    
    public static void printStringList(ArrayList<String> list)
    {
        for(String str:list)
        {
            System.out.println(str);
        }
        System.out.println("Size of list is: " + list.size());
    }
    
    public static void printStringListWithWhile(ArrayList<String> list)
    {
        System.out.println("Printing list with while and Iterator.");
        Iterator<String> iter;
        iter = list.iterator();
        
        while(iter.hasNext())
        {
            String current = iter.next();
            System.out.println(current);
        }
    }
}
