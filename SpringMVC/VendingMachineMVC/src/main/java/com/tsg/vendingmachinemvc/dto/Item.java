/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.vendingmachinemvc.dto;

import java.util.Objects;

/**
 *
 * @author apprentice
 */
public class Item {
    private String itemName;
    private Double itemCost;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.itemName);
        hash = 11 * hash + Objects.hashCode(this.itemCost);
        hash = 11 * hash + Objects.hashCode(this.amountLeft);
        hash = 11 * hash + Objects.hashCode(this.index);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemCost, other.itemCost)) {
            return false;
        }
        if (!Objects.equals(this.amountLeft, other.amountLeft)) {
            return false;
        }
        if (!Objects.equals(this.index, other.index)) {
            return false;
        }
        return true;
    }
    private Integer amountLeft;
    private Integer index;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemCost() {
        return itemCost;
    }

    public void setItemCost(Double itemCost) {
        this.itemCost = itemCost;
    }

    public Integer getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(Integer amountLeft) {
        this.amountLeft = amountLeft;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
