/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.flooringmastery.data;

import com.tsg.masterdependency.dao.ProductDAO;
import com.tsg.masterdependency.dto.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class ProductAccessDAO implements ProductDAO {

    private static final String DELIMITER = "::";

    @Override
    public void loadProducts() throws FileNotFoundException {

        String ORDER_FILE = "productInfo.txt";
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ORDER_FILE)));
        String currentLine;
        String[] currentTokens;
        Integer productNum = 0;

        while (sc.hasNextLine()) {
            productNum++;

            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Product product = new Product();
            product.setType(currentTokens[0]);
            product.setSqFtLaborCost(Double.parseDouble(currentTokens[1]));
            product.setSqFtMaterialCost(Double.parseDouble(currentTokens[2]));
            interfaceProduct.put(productNum, product);
        }
    }

    @Override
    public String getListOfProducts() {
        
        Set<Integer> keys = interfaceProduct.keySet();
        String string = "";
        for (Integer key : keys) {
            string += "\n\t" + key + ": " + interfaceProduct.get(key).getType();
        }
        return string;
    }
    
    @Override
    public Double getMaterialCost(Integer type) {
        Double cost = interfaceProduct.get(type).getSqFtMaterialCost();
        return cost;
    }
    
    @Override
    public Double getLaborCost(Integer type)
    {
        Double cost =  interfaceProduct.get(type).getSqFtLaborCost();
        return cost;
    }

    @Override
    public Product getProductInfo(Integer type) {
        return interfaceProduct.get(type);
    }
    
    @Override
    public Integer getProductListSize()
    {
        return interfaceProduct.size();
    }
}
