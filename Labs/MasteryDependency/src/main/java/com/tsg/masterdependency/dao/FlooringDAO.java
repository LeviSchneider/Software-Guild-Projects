/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.masterdependency.dao;

import com.tsg.masterdependency.dto.Order;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface FlooringDAO {

    
    public void loadCurrentInfo(String date) throws FileNotFoundException;
    public void writeCurrentInfo() throws IOException;
    public Map<Integer, Order> returnMap();
    public Order getCurrentInfo(Integer index);
    public Integer[] getOrderList();
    public String viewDateInfo(String date);
    public String viewOrderInfo(int orderNum);
    public void removeOrder(int index);
    public void commitOrder(Order order);
    public void commitEdit(Order order);
    public void loadOrderNum()throws FileNotFoundException;
    public void writeOrderNum()  throws IOException;
    public Integer getOrderNum();
    public void setOrderNum(Integer orderNum);
}
