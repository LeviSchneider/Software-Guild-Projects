/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.masterdependency.dao;

import com.tsg.masterdependency.dto.State;
import java.io.FileNotFoundException;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public interface StateDAO {
    public HashMap<Integer, State> interfaceState = new HashMap<>();
    public void loadStates() throws FileNotFoundException;
    public String getListOfStates(); 
    public State getStateInfo(Integer state);
}
