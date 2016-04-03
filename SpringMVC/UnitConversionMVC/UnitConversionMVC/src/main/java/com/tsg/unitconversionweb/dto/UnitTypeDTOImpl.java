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
public class UnitTypeDTOImpl implements UnitTypeDTO {
    private String name;
    private String unitCode;
    private boolean selected;

    public UnitTypeDTOImpl( String name, String unitCode ) {
        this.name = name;
        this.unitCode = unitCode;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getUnitCode() {
        return unitCode;
    }

    @Override
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    @Override
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
