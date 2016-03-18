/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.stackexample.generic;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class ArrayStackGeneric<ItemType> implements StackInterfaceGeneric<ItemType> {

    private static final int DEFAULT_INITIAL_SIZE = 4;
    private ItemType[] items; 
    private int numItems; 
    
    public ArrayStackGeneric()
    {
        this(DEFAULT_INITIAL_SIZE);
    }
    
    public ArrayStackGeneric(int size)
    {
        items = (ItemType[]) new Object[size];
    }
    
    @Override
    public void push(ItemType o) {
        if(numItems == items.length)
        {
            resize(2*items.length);
        }
        items[numItems] = o;
        numItems++;
    }

    @Override
    public ItemType pop() {
        if(numItems == 0)
        {
            return null;
        }
        numItems--;
        ItemType item = items[numItems];
        items[numItems] = null;
        
        if(numItems > 0 && numItems == items.length/4)
        {
            resize(items.length/2);
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
    
    private void resize(int newSize) {
        ItemType[] temp = (ItemType[]) new Object[newSize];
        for(int i = 0; i< numItems; i++)
        {
            temp[i] = items[i];
        }
        items = temp;
    }

    @Override
    public Iterator<ItemType> iterator() {
        return new ReverseArrayIterator<ItemType>(items);
    }    
    
    private class ReverseArrayIterator<T> implements Iterator<T>
    {
        private int i = numItems;
        private T[] iterItems;
        
        public ReverseArrayIterator(T[] iterItems)
        {
            this.iterItems = iterItems;
        }
        
        
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            i--;
            return iterItems[i];
        }
        
        
    }

    
}
