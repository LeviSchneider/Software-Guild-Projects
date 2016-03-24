/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.flooringmastery.model;

/**
 *
 * @author apprentice
 */
public class Product {
    private String type;
    private Double sqFtLaborCost;
    private Double sqFtMaterialCost;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getSqFtLaborCost() {
        return sqFtLaborCost;
    }

    public void setSqFtLaborCost(Double sqFtLaborCost) {
        this.sqFtLaborCost = sqFtLaborCost;
    }

    public Double getSqFtMaterialCost() {
        return sqFtMaterialCost;
    }

    public void setSqFtMaterialCost(Double sqFtMaterialCost) {
        this.sqFtMaterialCost = sqFtMaterialCost;
    }
}
