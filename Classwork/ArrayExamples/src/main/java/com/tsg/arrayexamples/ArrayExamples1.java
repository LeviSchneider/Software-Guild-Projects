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
public class ArrayExamples1 {
    public static void main(String[] args){
        
        int[] teamScores;
        
        teamScores = new int[10];
        
        teamScores[0] = 2;
        teamScores[1] = 45;
        teamScores[2] = 4;
        teamScores[3] = 45;
        teamScores[4] = 43;
        teamScores[5] = 4;
        teamScores[6] = 4;
        teamScores[7] = 78;
        teamScores[8] = 5;
        teamScores[9] = 4;
        
        int[] otherScores = {2,5,66,77,35,45,6,8,6,8,78};
        
        int otherScore = otherScores[3];
        otherScores[4] = 109;
        
        for(int i = 0; i < teamScores.length; i++)
        {
            System.out.println("Element # " + i + " = " + teamScores[i]);
        }
        
        String[] words = {"one", "another", "three", "something", "donkey lobster", "banana", "bean juice"};
        for(String badMonkey : words)
        {
            System.out.println("Next element is:" + badMonkey);
        }
        
        
    }
}
