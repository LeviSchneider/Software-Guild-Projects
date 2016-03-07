/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.warmupdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class WarmUpMar7 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> Cleveland = new ArrayList<>();
        Cleveland.add("Browns");
        Cleveland.add("Indians");
        
        ArrayList<String> Pittsburgh = new ArrayList<>();
        Cleveland.add("Steelers");
        Cleveland.add("Pirates");
        
        ArrayList<String> Cincinnati = new ArrayList<>();
        Cleveland.add("Bengals");
        Cleveland.add("Reds");
        
        ArrayList<String> Minneapolis = new ArrayList<>();
        Cleveland.add("Vikings");
        Cleveland.add("Twins");
        
        ArrayList<String> KansasCity = new ArrayList<>();
        Cleveland.add("Chiefs");
        Cleveland.add("Royals");
        
        map.put("Cleveland", Cleveland);
        map.put("Pittsburgh", Pittsburgh);
        map.put("Cincinnati", Cincinnati);
        map.put("Minneapolis", Minneapolis);
        map.put("Kansas City", KansasCity);
        
        Set keys = map.keySet();
        
        for(HashMap.Entry<String, ArrayList<String>> entry: map.entrySet())
        {
            String key = entry.getKey();
            String[] value = (entry.getValue()).toArray(new String[(entry.getValue()).size()]);
            System.out.println(key + ": \n");
            for(int i = 0; i < value.length; i++)
            {
                System.out.println(value[i] + "");
            }
        }
    }
}
