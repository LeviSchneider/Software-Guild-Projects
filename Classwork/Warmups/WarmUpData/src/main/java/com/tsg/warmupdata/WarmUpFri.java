/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.warmupdata;

/**
 *
 * @author apprentice
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class WarmUpFri {

    public static void main(String[] args) {
        HashMap<String, String> teams = new HashMap<>();
        teams.put("Cleveland", "Browns");
        teams.put("Pittsburgh", "Steelers");
        teams.put("Cincinnati", "Bengals");
        teams.put("Minneapolis", "Vikings");
        teams.put("Kansas City", "Chiefs");

        Set<String> keys = teams.keySet();
        for (HashMap.Entry<String, String> entry : teams.entrySet()) {
            String key = entry.getKey();
            System.out.println(key);
            String value = entry.getValue();
            System.out.println(value);
        }

        Iterator it = teams.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            System.out.println(pair.getKey() + " -- " + pair.getValue());
            it.remove();
        }

        Iterator entries = teams.entrySet().iterator();
        while (entries.hasNext()) {
            Entry thisEntry = (Entry) entries.next();
            Object key = thisEntry.getKey();
            Object value = thisEntry.getValue();
            System.out.println(thisEntry.getKey());
            System.out.println(" ");
            System.out.println(thisEntry.getValue());
        }
    }
}
