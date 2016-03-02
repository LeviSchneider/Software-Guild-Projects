/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dicerolll;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author apprentice
 */
public class DiceRoll {

    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;
        final int MAX_ROLLS = 50;
        Random rng = new Random();
        HashMap<Integer, Integer> rolls = new HashMap<>();
        HashMap<String, Integer> indivRolls = new HashMap<>();

        for (int i = 0; i < MAX_ROLLS; i++) {
            die1 = rng.nextInt(6) + 1;
            die2 = rng.nextInt(6) + 1;

            //Integer prevTotal = rolls.get(total);
            Integer prevTotal = indivRolls.get(die1 + "-" + die2);
            if (prevTotal == null) {
                //rolls.put(total, 1);
                indivRolls.put(die1 + "-" + die2, 1);
            } else {
                //rolls.put(total, prevTotal + 1);
                indivRolls.put(die1 + "-" + die2, prevTotal + 1);
            }

        }
        Map<String, Integer> indivRollsSort = new TreeMap<String, Integer>(indivRolls);
        
        Set<String> keys = indivRollsSort.keySet();
        for (String key : keys) {
            Integer total = indivRollsSort.get(key);
            System.out.print(key + ": ");
            if (total != null) {
                
                for (int j = 0; j < total; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("none");
            }
            System.out.println();
        }
        
    }
}
