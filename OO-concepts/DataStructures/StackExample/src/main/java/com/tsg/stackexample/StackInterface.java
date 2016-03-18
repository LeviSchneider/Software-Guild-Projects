/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.stackexample;

/**
 *
 * @author apprentice
 */
public interface StackInterface extends Iterable{
    public void push(Object o);
    public Object pop();
    public int size();
    public boolean isEmpty();
}
