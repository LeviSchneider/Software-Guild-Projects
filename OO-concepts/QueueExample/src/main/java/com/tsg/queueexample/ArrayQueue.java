/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.queueexample;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author apprentice
 */
public class ArrayQueue implements QueueInterface {

    private static final int DEFAULT_INITIAL_SIZE = 4;
    private Object[] items;
    private int numItems = 0;
    private int head = 0;

    @Override
    public void enqueue(Object o) {
        if(numItems + 1 == items.length) resize(2*items.length);
        items[(head + numItems) % items.length] = o;
        numItems++;
    }

    @Override
    public Object dequeue() {
        if (numItems == 0) throw new NoSuchElementException();
        Object o = items[head];
        head = (head + 1) % items.length;
        numItems--;
        
        items[numItems] = null;
        head++;
        
        if (numItems >= 3 * numItems) resize(2 * items.length);
        return o;
    }

    @Override
    public int size() {
        return numItems;
    }

    public void resize(int newSize) {
        Object[] temp = new Object[Math.max(1, newSize * 2)];
        for (int i = 0; i < numItems; i++) {
            temp[i] = items[(head + i) % items.length];
        }
        items = temp;
        head = 0;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public Iterator iterator() {
        return new ReverseArrayIterator();
    }

    public class ReverseArrayIterator implements Iterator {
        
        private int i = head;
        
        @Override
        public boolean hasNext() {
            return i > size() + head;
        }

        @Override
        public Object next() {
            i++;
            return items[i];
        }

    }
}
