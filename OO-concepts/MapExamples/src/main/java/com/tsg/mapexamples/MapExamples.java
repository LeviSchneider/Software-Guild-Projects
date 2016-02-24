/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.mapexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class MapExamples {
    public static void main(String[] args) {
        HashMap<String, Integer> population = new HashMap<>();
        
        //population.put("USA", 313000000);
        //This value is incorrect!
        population.put("USA", 200000000);
        
        population.put("Canada", 34000000);
        
        population.put("UK", 63000000);
        
        population.put("Japan", 127000000);
        
        population.put("USA", 313000000);
        System.out.println("Map size is: " + population.size());
        
        Integer japanPopulation = population.get("Japan");
        
        System.out.println("The population of Japan is: " + japanPopulation);
        System.out.println("Yet again population of Japan is: " + population.get("Japan"));
        
        //You cannot add the same element value to set twice
        //can also be Collection<String> keys = population.keySet(); //putting it in a collection is also valid.
        Set<String> keys = population.keySet();
        
        System.out.println("=========== printing a list of keys ==============");
        for(String k: keys)
        {
            System.out.println(k);
        }
        
        System.out.println("------------------Printing out all the vlaues---------------------");
        
        for(String k: keys)
        {
            System.out.println("The population of " + k + " is " + population.get(k));
        }
        
        System.out.println("++++++++++++++++++Printing out pure population lsit without keys +++++++++++++++++++++");
        Collection<Integer> popValues = population.values();
        
        for(int p:popValues)
        {
            System.out.println(p);
        }
        
    }
    
}
