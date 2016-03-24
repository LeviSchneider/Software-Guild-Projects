/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package com.tsg.flooringmastery.controller;



import com.tsg.flooringmastery.consoleIO.ConsoleIO;
import com.tsg.flooringmastery.data.ProductAccessDAO;
import com.tsg.flooringmastery.data.StateAccessDAO;
import com.tsg.masterdependency.dto.Order;
import com.tsg.masterydependency.ui.ConsoleInterface;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 *
 * @author apprentice
 */
public class BusinessLogic {
    
    static final String DELIMITER = "::";

    ConsoleInterface io = new ConsoleIO();
    ProductAccessDAO productDAO = new ProductAccessDAO();
    StateAccessDAO stateDAO = new StateAccessDAO();
    DecimalFormat df = new DecimalFormat("#.##");

    public Order createOrder(Integer orderNum, String name, Integer state, Integer product, String date, Integer area) throws FileNotFoundException, IOException{
        productDAO.loadProducts();
        stateDAO.loadStates();
        Double laborCost = (productDAO.getProductInfo(product)).getSqFtLaborCost();
        Double materialsCost = (productDAO.getProductInfo(product)).getSqFtMaterialCost();
        Double tax = (stateDAO.getStateInfo(state)).getTax();
        
        //Setting the object
        Order order = new Order();
        order.setOrderNum(orderNum);
        order.setCustomerName(name);
        order.setState((stateDAO.getStateInfo(state)).getName());
        order.setTaxRate(tax);
        order.setProductType((productDAO.getProductInfo(product)).getType());
        order.setArea(area);
        order.setDate(date);
        order.setSqFtMaterialCost(materialsCost);
        order.setSqFtLaborCost(laborCost);
        order.setTotalLaborCost(Double.parseDouble(df.format(area * laborCost)));
        order.setTotalMaterialCost(Double.parseDouble(df.format(area * materialsCost)));
        order.setTotalTax(Double.parseDouble(df.format((tax/100) * ((area * materialsCost) + (area * laborCost)))));
        order.setTotalTotal(Double.parseDouble(df.format(((tax/100) * ((area * materialsCost) + (area * laborCost)) + (area * materialsCost) + (area * laborCost)))));
        
        return order;
    }
}
