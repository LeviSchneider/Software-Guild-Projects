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
public class Min extends Calculation{
    
    public Min()
    {
        super.calculationName = "Minimum";
    }

    @Override
    public void Calculate(List<Double> values) {
        Double minimum = Double.MAX_VALUE;
        for(Double value: values)
        {
            minimum = (minimum>value)?value: minimum;
        }
        result = minimum.toString();
    }
    
}
