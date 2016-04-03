/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.vendingmachinemvc.dao;

import com.tsg.vendingmachinemvc.dto.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author apprentice    
 */
public class VendingMachineDAOImpl implements VendingMachineDAO {
    
    protected static int itemIdCounter = 0;
    HashMap<Integer, Item> itemMap = new HashMap<>();
    private final Item item1,item2,item3;

    public VendingMachineDAOImpl()
    {
        item1 = new Item();
        item1.setAmountLeft(3);
        item1.setIndex(1);
        item1.setItemCost(1.5);
        item1.setItemName("Snickers");
        itemMap.put(item1.getIndex(), item1);
        
        item2 = new Item();
        item2.setAmountLeft(1);
        item2.setIndex(2);
        item2.setItemCost(1.5);
        item2.setItemName("M&Ms");
        itemMap.put(item2.getIndex(), item2);
        
        item3 = new Item();
        item3.setAmountLeft(3);
        item3.setIndex(3);
        item3.setItemCost(1.5);
        item3.setItemName("Milky Way");
        itemMap.put(item3.getIndex(), item3);
        
    }
    @Override
    public Item addItem(Item item) {
        item.setIndex(itemIdCounter);
        itemIdCounter++;
        itemMap.put(item.getIndex(), item);
        return item;
    }

    @Override
    public void updateItem(Item item) {
        itemMap.put(item.getIndex(), item);
    }

    @Override
    public List<Item> getAllItems() {
        Collection<Item> c = itemMap.values();
        return new ArrayList(c);
    }

    @Override
    public Item getItemById(int itemId) {
        return itemMap.get(itemId);
    }
}
