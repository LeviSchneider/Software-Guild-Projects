/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unitconversionweb.dto;

/**
 *
 * @author apprentice
 */
public interface UnitTypeDTO {

    String getName();

    String getUnitCode();

    boolean isSelected();

    void setName(String name);

    void setSelected(boolean selected);

    void setUnitCode(String unitCode);
    
}
