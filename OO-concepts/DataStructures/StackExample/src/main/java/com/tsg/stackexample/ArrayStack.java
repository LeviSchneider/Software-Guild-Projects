/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.stackexample;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class ArrayStack implements StackInterface {
    
    private static final int DEFAULT_INITIAL_SIZE = 4;
    private Object[] items;
    private int numItems = 0;
    
    public ArrayStack()
    {
        this(DEFAULT_INITIAL_SIZE);
    }
    
    public ArrayStack(int size)
    {
        items = new Object[size];
    }
    
    @Override
    public void push(Object o) {
        if(numItems == items.length)
        {
            try {
                resize(2*items.length);
            } catch (Exception ex) {
                Logger.getLogger(ArrayStack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        items[numItems] = o;
        numItems++;
    }

    @Override
    public Object pop() {
        if(numItems == 0)
        {
            return null;
        }
        numItems--;
        Object item = items[numItems];
        items[numItems] = null;
        
        if(numItems > 0 && numItems == items.length/4)
        {
            try {
                resize(items.length/2);
            } catch (Exception ex) {
                Logger.getLogger(ArrayStack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return item;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    private void resize(int newSize) throws Exception {
        try{
        Object[] temp = new Object[newSize];
        for(int i = 0; i< numItems; i++)
        {
            temp[i] = items[i];
        }
        items = temp;
        } catch(Exception e)
        {
            System.out.println("There is a problem with the resize method.");
        }
    }

    @Override
    public Iterator iterator() {
        return new ReverseArrayIterator();
    }
    
    private class ReverseArrayIterator implements Iterator
    {
        private int i = numItems;
        
        
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Object next() {
            i--;
            return items[i];
        }
        
    }
    
}
