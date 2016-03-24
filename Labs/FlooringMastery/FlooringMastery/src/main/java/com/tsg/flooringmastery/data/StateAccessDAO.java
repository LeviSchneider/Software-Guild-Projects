/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.flooringmastery.data;

import com.tsg.masterdependency.dao.StateDAO;
import com.tsg.masterdependency.dto.State;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class StateAccessDAO implements StateDAO{
    private static final String DELIMITER = "::";

    @Override
    public void loadStates() throws FileNotFoundException {

        String ORDER_FILE = "stateTax.txt";
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ORDER_FILE)));
        String currentLine;
        String[] currentTokens;
        Integer stateNum = 0;


        while (sc.hasNextLine()) {
            stateNum++;
            
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            State state = new State();
            state.setName(currentTokens[0]);
            state.setTax(Double.parseDouble(currentTokens[1]));
            
            interfaceState.put(stateNum, state);
        }
    }

    @Override
    public String getListOfStates()
    {
        Set<Integer> keys = interfaceState.keySet();

        String string = "";
        for (Integer key : keys)
        {
            string += "\n\t" + key + ": " +interfaceState.get(key).getName();
        }
        return string;
    }
    
    @Override
    public State getStateInfo(Integer state)
    {
        return interfaceState.get(state);
    }
}
