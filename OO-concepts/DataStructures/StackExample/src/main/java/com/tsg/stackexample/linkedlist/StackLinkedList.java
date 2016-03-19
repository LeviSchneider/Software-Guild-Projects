/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.stackexample.linkedlist;

/**
 *
 * @author apprentice
 * @param <T>
 */
public interface StackLinkedList<T> extends Iterable {
    void push(T o);
    T pop();
    boolean isEmpty();
    int size();
}
