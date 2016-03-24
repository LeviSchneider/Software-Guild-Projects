/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.flooringmastery.data;

import com.tsg.masterdependency.dao.FlooringDAO;
import com.tsg.masterdependency.dto.Order;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class FlooringMasteryDAO implements FlooringDAO{
    public static Map<Integer, Order> interfaceMap = new HashMap<>();
    public static HashMap<String, String> fileMap = new HashMap<>();
    private Set<Integer> keys;
    private Set<String> filekey;
    static final String DELIMITER = "::";
    public Integer orderNum = 1;

    @Override
    public void loadCurrentInfo(String date) throws FileNotFoundException {
        String ORDER_FILE = "order_" + date + ".txt";
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ORDER_FILE)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Order order = new Order();
            order.setOrderNum(Integer.parseInt(currentTokens[0]));
            order.setCustomerName(currentTokens[1]);
            order.setState(currentTokens[2]);
            order.setTaxRate(Double.parseDouble(currentTokens[3]));
            order.setProductType(currentTokens[4]);
            order.setArea(Integer.parseInt(currentTokens[5]));
            order.setSqFtMaterialCost(Double.parseDouble(currentTokens[6]));
            order.setSqFtLaborCost(Double.parseDouble(currentTokens[7]));
            order.setTotalLaborCost(Double.parseDouble(currentTokens[8]));
            order.setTotalMaterialCost(Double.parseDouble(currentTokens[9]));
            order.setTotalTax(Double.parseDouble(currentTokens[10]));
            order.setTotalTotal(Double.parseDouble(currentTokens[11]));
            order.setDate(currentTokens[12]);
        }
    }

    @Override
    public void writeCurrentInfo() throws IOException {
        filekey = fileMap.keySet();
        keys = interfaceMap.keySet();
        for (String key : filekey) {
            PrintWriter writer = new PrintWriter(new FileWriter(fileMap.get(key)));
            
            for (Integer o : keys) {

                Order order = interfaceMap.get(o);
                String something = "order_" + order.getDate() + ".txt";
                if(something.equals(fileMap.get(key)))
                {
                writer.println(order.getOrderNum() + DELIMITER
                        + order.getCustomerName() + DELIMITER
                        + order.getState() + DELIMITER
                        + order.getTaxRate() + DELIMITER
                        + order.getProductType() + DELIMITER
                        + order.getArea() + DELIMITER
                        + order.getSqFtMaterialCost() + DELIMITER
                        + order.getSqFtLaborCost() + DELIMITER
                        + order.getTotalLaborCost() + DELIMITER
                        + order.getTotalMaterialCost() + DELIMITER
                        + order.getTotalTax() + DELIMITER
                        + order.getTotalTotal() + DELIMITER
                        + order.getDate());
                writer.flush();
                }
            }
            writer.close();
        }
    }
    
    @Override
    public Map<Integer, Order> returnMap()
    {
        return interfaceMap;
    }

    @Override
    public Order getCurrentInfo(Integer index) {
        return interfaceMap.get(index);
    }

    @Override
    public Integer[] getOrderList() {
        Integer[] list = interfaceMap.keySet().toArray(new Integer[0]);
        return list;
    }
    
    @Override
    public String viewDateInfo(String date){
        keys = interfaceMap.keySet();
        String string = "";

        string = keys.stream().filter((key) -> (interfaceMap.get(key).getDate().equals(date))).map((key) -> "\n********************************************\n* Order #: " + interfaceMap.get(key).getOrderNum() + "\t\tDate: " + interfaceMap.get(key).getDate() + "\n********************************************\n* Customer Name:\t\t" + interfaceMap.get(key).getCustomerName() + "\n* State:\t\t\t" + interfaceMap.get(key).getState() + "\n* Floor Type:\t\t\t" + interfaceMap.get(key).getProductType() + "\n* Project Size:\t\t\t" + interfaceMap.get(key).getArea() + "sq.ft\n\n* Total materials @$" + interfaceMap.get(key).getSqFtMaterialCost() + "/sq.ft\t$" + interfaceMap.get(key).getTotalMaterialCost() + "\n* Total labor @$" + interfaceMap.get(key).getSqFtLaborCost() + "/sq.ft\t$" + interfaceMap.get(key).getTotalLaborCost() + "\n* Tax @" + interfaceMap.get(key).getTaxRate() + "%\t\t\t$" + interfaceMap.get(key).getTotalTax() + "\n* Total:\t\t\t$" + interfaceMap.get(key).getTotalTotal() + "\n********************************************").reduce(string, String::concat);
        return string;
    }

    @Override
    public String viewOrderInfo(int orderNum) {
        String string = "";
        Order dave = interfaceMap.get(orderNum);
        string += "\n********************************************\n*\t      Date: " + dave.getDate() + "\n********************************************\n* Order #:\t\t\t" + dave.getOrderNum() + "\n* Customer Name:\t\t" + dave.getCustomerName() + "\n* State:\t\t\t" + dave.getState() + "\n* Floor Type:\t\t\t" + dave.getProductType() + "\n* Project Size:\t\t\t" + dave.getArea() + "sq.ft\n\n* Total materials @$" + dave.getSqFtMaterialCost() + "/sq.ft\t$" + dave.getTotalMaterialCost() + "\n* Total labor @$" + dave.getSqFtLaborCost() + "/sq.ft\t$" + dave.getTotalLaborCost() + "\n* Tax @" + dave.getTaxRate() + "%\t\t\t$" + dave.getTotalTax() + "\n* Total:\t\t\t$" + dave.getTotalTotal() + "\n********************************************";
        return string;

    }

    @Override
    public void removeOrder(int index) {
        interfaceMap.remove(index);

    }

    @Override
    public void loadOrderNum() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("orderNum.txt")));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            orderNum = Integer.parseInt(currentTokens[0]);
        }
    }

    
    @Override
    public void writeOrderNum() throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("orderNum.txt"))) {
            writer.println(orderNum);
            writer.flush();
        }
    }

    @Override
    public Integer getOrderNum() {
        return orderNum;
    }

    @Override
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
    
    @Override
    public void commitOrder(Order order) {
        order.setOrderNum(orderNum);
        String file = "order_" + order.getDate() + ".txt";
        interfaceMap.put(order.getOrderNum(), order);
        fileMap.put(order.getDate(), file);
        orderNum++;
    }

    @Override
    public void commitEdit(Order order) {
        String string = "order_" + order.getDate() + ".txt";
        interfaceMap.put(order.getOrderNum(), order);
        fileMap.put(order.getDate(), string);
    }
}
