/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unitconversionweb.dao;

import com.tsg.unitconversionweb.dto.UnitTypeDTO;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface UnitTypeDAO {

    List<UnitTypeDTO> getUnitTypes();
    
}
