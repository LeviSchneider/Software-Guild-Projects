/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.abstractclassexample.calc;

import java.util.List;

/**
 *
 * @author apprentice
 */
public class Average extends Calculation{
    
    public Average(){
        calculationName = "Average";
    }

    @Override
    public void Calculate(List<Double> values) {
        double average = 0;
        for(int i = 0; i < values.size(); i++)
        {
            average += values.get(i);
        }
        
        average /= values.size();
       
        result = "" + average;
    }
    
}
