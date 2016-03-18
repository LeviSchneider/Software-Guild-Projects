/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.linkedlistexamples;

/**
 *
 * @author apprentice
 */
public class LinkedListDriver {

    public static void main(String[] args) {

        LinkedList ll = new LinkedListNodeImpl();

        ll.append("Sample One");

        System.out.println(ll.get(0));

        try {
            System.out.println(ll.get(1));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Tried to read beyond end of linked list");
        }
        
        ll.prepend("Prepend this one");
        
        System.out.println(ll.get(0));
        
        ll.insert(0, "This one should go to the middle.");
        
        
        System.out.println(ll.get(1));
        
        System.out.println("--------------- enhanced for loop printing ---------------------------");
        
        for(Object s: ll)
        {
            System.out.println(s);
        }
    }
}
