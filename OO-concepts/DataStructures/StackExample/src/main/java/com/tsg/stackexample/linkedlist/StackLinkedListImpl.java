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
 * @param <ItemType>
 */
public class StackLinkedListImpl<ItemType> implements StackLinkedList<ItemType> {

    private Node first;
    private Node last;
    private int numItems;

    @Override
    public int size() {
        return numItems;
    }

    private class Node {

        ItemType item;
        Node next;

    }

    @Override
    public void push(ItemType item) {
        Node prevLast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) {
            first = last;
        } else {
            prevLast.next = last;
        }
        numItems++;
    }

    @Override
    public ItemType pop() {
        ItemType item = null;
        Node before = null;
        numItems--;
        if (numItems < 0) {
            last = null;
            first = last;
            numItems = 0;
            item = null;
        } else if (last != null) {
            before = last;
            item = last.item;
            last = new Node();
            Node prevLast = getNode(numItems);
            last = prevLast;
        }
        if(last == before)
        {
            last = getNode(numItems - 1);
        }

        return item;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {

        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public ItemType next() {
            ItemType item = current.item;
            current = current.next;
            return item;
        }

    }

    private Node getNode(int index) {
        Node nodeAtIndex = first;
        for (int i = 0; i < index; i++) {
            nodeAtIndex = nodeAtIndex.next;
        }
        return nodeAtIndex;
    }
}
