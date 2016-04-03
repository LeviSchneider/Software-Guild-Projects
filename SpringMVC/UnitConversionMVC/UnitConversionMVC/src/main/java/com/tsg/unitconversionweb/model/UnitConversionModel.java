/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unitconversionweb.model;

import com.tsg.unitconversionweb.dao.UnitTypeDAO;
import com.tsg.unitconversionweb.dao.UnitTypeDAOImpl;
import com.tsg.unitconversionweb.dto.UnitTypeDTO;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class UnitConversionModel {
    private UnitTypeDAO unitTypeDAO = new UnitTypeDAOImpl();
    
    public List<UnitTypeDTO> getUnitTypes() {
        return unitTypeDAO.getUnitTypes();
    }
}
