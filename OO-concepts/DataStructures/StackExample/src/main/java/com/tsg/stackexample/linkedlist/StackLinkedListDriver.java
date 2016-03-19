/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.stackexample.linkedlist;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class StackLinkedListDriver {
    public static void main(String[] args) {
        StackLinkedList<Integer> stack = new StackLinkedListImpl<>();
        
//    stack.push(1);
//    stack.push(2);
//    stack.push(3);
//    stack.push(4);
//
//    stack.pop();
//    stack.pop();
        
        for(int i = 1; i< 100;i++)
        {
            stack.push(i);
            if((i % 13) == 0)
            {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }
        
        Iterator itr = stack.iterator();
        while(itr.hasNext())
        {
            System.out.println("Number " + itr.next());
        }
    }
}
