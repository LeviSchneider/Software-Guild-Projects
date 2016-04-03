/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.vendingmachinemvc.dao;

import com.tsg.vendingmachinemvc.dto.Item;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface VendingMachineDAO {
    public Item addItem(Item item);
    public void updateItem(Item item);
    public List<Item> getAllItems();
    public Item getItemById(int itemId);
    
}
