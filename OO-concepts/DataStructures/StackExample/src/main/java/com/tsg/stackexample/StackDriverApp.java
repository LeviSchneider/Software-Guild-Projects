/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.stackexample;

import com.tsg.stackexample.generic.ArrayStackGeneric;
import com.tsg.stackexample.generic.StackInterfaceGeneric;
import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class StackDriverApp {
    
    public static void main(String[] args) {
        StackInterface stack = new ArrayStack();
        
        StackInterfaceGeneric<String> gs = new ArrayStackGeneric<>();
        
        
        
        String a = "a";
        String b = "b";
        String c = "42";
        String d = "d";
        String f = "f";//failure
        
        System.out.println("Pushing " + a );
        stack.push(a);
        gs.push(a);
        System.out.println("Pushing " + b );
        stack.push(b);
        gs.push(b);
        System.out.println("Pushing " + c );
        stack.push(c);
        gs.push(c);//if this was of type integer then gs wouldn't work because... 
        //gs is referencing an interface that is of type <String>
        System.out.println("Pushing " + d );
        stack.push(d);
        gs.push(d);
        System.out.println("Pushing " + f );
        stack.push(f);
        gs.push(f);
        
        Iterator itr = stack.iterator();
        System.out.println("Printing vlaue in stack using iterator...");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Printing stack values using enhanced for loop...");
        for(Object o: stack)
        {
            System.out.println(o);
        }
        
        System.out.println("Printing GENERIC stack values with an enhanced for loop..");
        
        for(String s : gs)
        {
            System.out.println("==> " + s);
        }
        
        System.out.println("Popping...");
        System.out.println("value: " + stack.pop());
        System.out.println("Popping...");
        System.out.println("value: " + stack.pop());
        System.out.println("Popping...");
        System.out.println("value: " + stack.pop());
        System.out.println("Popping...");
        System.out.println("value: " + stack.pop());
        System.out.println("Popping...");
        System.out.println("value: " + stack.pop());
        
    }
    
}
