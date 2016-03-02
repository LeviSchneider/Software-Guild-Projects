/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dicerolll;

import java.util.HashMap;
import java.util.Random;

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

        for (int i = 0; i < MAX_ROLLS; i++) {
            die1 = rng.nextInt(6) + 1;
            die2 = rng.nextInt(6) + 1;

            int total = die1 + die2;

            Integer prevTotal = rolls.get(total);
            if (prevTotal == null) {
                rolls.put(total, 1);
            } else {
                rolls.put(total, prevTotal + 1);
            }

        }
        for (int i = 2; i <= 12; i++) {
            Integer total = rolls.get(i);
            System.out.print(i + ": ");
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
