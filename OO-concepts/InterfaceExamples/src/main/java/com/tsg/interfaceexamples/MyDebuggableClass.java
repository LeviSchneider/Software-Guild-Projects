/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.interfaceexamples;

/**
 *
 * @author apprentice
 */
public class MyDebuggableClass implements Debuggable{

    @Override
    public void displayStatus(String id) {
        System.out.println("Status id is: " + id);
    }

    @Override
    public void displayError(String error) {
        System.out.println("ERROR: things broke like so: " + error);
    }
    
}
