/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.arrayexamples;

/**
 *
 * @author apprentice
 */
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] cityTeamNames = 
        {
            //Jagged array when multiple arrays have different number of elements
            {"Cleveland", "Browns", "Cavs", "Indians"},
            {"Columbus", "Bluejackets", "Buckeyes"},
            {"Pittsburgh", "Steelers", "Pirates", "Penguins"}
        };
        for(int i= 0; i < cityTeamNames.length; i++)
        {
            for(int j = 0; j < cityTeamNames[i].length; j++)
            {
                System.out.print(cityTeamNames[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
