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
public class Max extends Calculation {
    
    public Max()
    {
        super.calculationName = "Maximum";
    }

    @Override
    public void Calculate(List<Double> values) {
        Double maximum = 0.0;
        for (Double value:  values) {
            maximum = (maximum<value)?value:maximum;
        }
        result = maximum.toString();
    }

}
