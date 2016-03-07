/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.abstractclassexample;

import com.tsg.abstractclassexample.calc.Average;
import com.tsg.abstractclassexample.calc.Calculation;
import com.tsg.abstractclassexample.calc.Max;
import com.tsg.abstractclassexample.calc.Min;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        
        //calculation factory
        List<Calculation> calcs = new ArrayList<>();
        
        calcs.add(new Average());
        calcs.add(new Max());
        calcs.add(new Min());
        //calculation engine
        
        Double[] valuesArray = {42.7, 23.55, 1.087, 9.9, 8.7, 43.76, 12.39, 78.64, 11.99};
        List<Double> values = Arrays.asList(valuesArray);
        
        for(Calculation calc: calcs)
        {
            calc.Calculate(values);
            calc.Display();
        }
    }
}
