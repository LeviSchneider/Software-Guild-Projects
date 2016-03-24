/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.masterdependency.dao;

import com.tsg.masterdependency.dto.Product;
import java.io.FileNotFoundException;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public interface ProductDAO {
    public HashMap<Integer, Product> interfaceProduct = new HashMap<>();
    public void loadProducts() throws FileNotFoundException;
    public String getListOfProducts();
    public Double getMaterialCost(Integer type);    
    public Double getLaborCost(Integer type);
    public Product getProductInfo(Integer type);
    public Integer getProductListSize();
}
