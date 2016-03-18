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
public interface LinkedList extends Iterable{
    
    // adds to end of list
    void append(Object item);
    
    Object get(int index);
    
    // insert after a given index
    void insert(int index, Object item);
    
    boolean isEmpty();
    
    //insert elements at the beginning
    void prepend(Object item);
    
    Object remove(int index);
    
    int size();
    
}
