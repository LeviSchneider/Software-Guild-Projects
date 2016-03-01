/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.playerscore;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class PlayerScore {

    static HashMap<String, Integer> playerScore = new HashMap<>();
    static Set<String> keys = playerScore.keySet();

    public static void main(String[] args) {
        double sum = 0;
        playerScore.put("Smith", 23);
        playerScore.put("Jones", 12);
        playerScore.put("Jordan", 45);
        playerScore.put("Pippen", 32);
        playerScore.put("Kerr", 15);
        
        String[] playerName = new String[playerScore.size()];
        
        playerName = keys.toArray(playerName);
        
        for (String string : playerName) {
            System.out.println(string+":"+playerScore.get(string));
            sum += playerScore.get(string);
        }
        sum = sum / playerScore.size();
        System.out.println("The average points scored this game was " + sum + " points.");
    }
}
