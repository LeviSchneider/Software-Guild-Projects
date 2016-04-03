/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unitconversionweb.dao;

import com.tsg.unitconversionweb.dto.UnitTypeDTO;
import com.tsg.unitconversionweb.dto.UnitTypeDTOImpl;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class UnitTypeDAOImpl implements UnitTypeDAO {

    @Override
    public List<UnitTypeDTO> getUnitTypes() {
        ArrayList<UnitTypeDTO> al = new ArrayList();
        al.add(new UnitTypeDTOImpl("Temperature", "TEMP"));
        al.add(new UnitTypeDTOImpl("Length", "LEN"));
        al.add(new UnitTypeDTOImpl("Weight", "WT"));
        return al;
    }
    
}
