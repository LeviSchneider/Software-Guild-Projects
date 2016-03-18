/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.linkedlistexamples;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class LinkedListNodeImpl implements LinkedList {

    private Node first;
    private Node last;
    private int numItem = 0;

    @Override
    public void append(Object item) {
        Node prevLast = last;
        last = new Node();
        last.item = item;

        if (isEmpty()) {
            first = last;
        } else {
            prevLast.next = last;
        }
        numItem++;
    }

    @Override
    public Object get(int index) {
        return getNode(index).item;
    }

    @Override
    public void insert(int index, Object item) {
        if (index == numItem - 1) {
            append(item);
        } else {
            Node nodeAtIndex = getNode(index);

            Node newNode = new Node();

            newNode.item = item;

            newNode.next = nodeAtIndex.next;

            nodeAtIndex.next = newNode;

            numItem++;
        }
    }

    @Override
    public boolean isEmpty() {
        return numItem == 0;
    }

    @Override
    public void prepend(Object item) {
        Node prevFirst = first;
        first = new Node();
        first.item = item;
        first.next = prevFirst;
        numItem++;

        if (numItem == 1) {
            last = first;
        }
    }

    @Override
    public Object remove(int index) {

        Object item = null;

        if (index == 0) {
            item = first.item;
            first = first.next;
            if (index == numItem - 1) {
                last = null;
            }
        } else {
            Node nodeBefore = getNode(index - 1);
            item = nodeBefore.next.item;
            nodeBefore.next = nodeBefore.next.next;
            if(index == numItem -1)
            {
                last = nodeBefore;
            }
        }

        numItem--;
        return item;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class Node {

        Object item;
        Node next;
    }
    
    private class LinkedListIterator implements Iterator
    {
        
        Node current = first;
        
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
            Object item = current.item;
            current = current.next;
            return item;
        }
        
    }

    private Node getNode(int index) {
        if (index >= numItem || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds. Must be between 0 and " + (numItem - 1) + " inclusive");
        }
        Node nodeAtIndex = first;
        for (int i = 0; i < index; i++) {
            nodeAtIndex = nodeAtIndex.next;
        }

        return nodeAtIndex;
    }

}
