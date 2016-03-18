/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.stackexample.generic;

/**
 *
 * @author apprentice
 */
public interface StackInterfaceGeneric<T> extends Iterable<T> {
    
    public void push(T o);
    public T pop();
    public int size();
    public boolean isEmpty();
}
