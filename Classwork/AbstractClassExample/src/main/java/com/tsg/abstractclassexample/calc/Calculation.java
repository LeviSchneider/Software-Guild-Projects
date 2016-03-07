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
abstract public class Calculation {
    protected String calculationName;
    protected String result;
    
    public void Display()
    {
        System.out.println("<!-----------------------------------------------!>");
        System.out.println("Calculation " + calculationName + " result: " + result);
        System.out.println("<!-----------------------------------------------!>");
    }
    
    abstract public void Calculate(List<Double> values);

    public String getCalculationName() {
        return calculationName;
    }

    public String getResult() {
        return result;
    }
}
