/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.queueexample;

/**
 *
 * @author apprentice
 */
public class QueueApp {
    public static void main(String[] args) {
        QueueInterface q = new ArrayQueue();
        
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        String f = "f";
        String g = "g";
        String h = "h";
        String i = "i";
        
        
        q.enqueue(a);
        q.enqueue(b);
        q.enqueue(c);
        q.enqueue(d);
        q.enqueue(e);
        q.enqueue(f);
        q.enqueue(g);
        
        q.dequeue();
        q.dequeue();
        
        
    }
}
