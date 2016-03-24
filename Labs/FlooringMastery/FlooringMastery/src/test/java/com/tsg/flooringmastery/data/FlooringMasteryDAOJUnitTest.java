package com.tsg.flooringmastery.data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.tsg.masterdependency.dao.FlooringDAO;
import com.tsg.masterdependency.dto.Order;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class FlooringMasteryDAOJUnitTest {
    FlooringDAO dao;
    ApplicationContext ctx;
    Order order1, order2, order3, order4;
    
    public FlooringMasteryDAOJUnitTest() {
    }
    
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = ctx.getBean("floorDAO", FlooringDAO.class);
        order1 = new Order();
        order1.setCustomerName("Jimmy");
        order1.setState("OH");
        order1.setTaxRate(6.25);
        order1.setProductType("Carpet");
        order1.setArea(1500); 
        order1.setSqFtMaterialCost(2.25);
        order1.setSqFtLaborCost(2.10); 
        order1.setTotalMaterialCost(3375.0);
        order1.setTotalLaborCost(3150.0);
        order1.setTotalTax(407.8125);
        order1.setTotalTotal(6932.8125);
        order1.setDate("20160122");
        
        order2 = new Order();
        order2.setCustomerName("Klammy");
        order2.setState("PA");
        order2.setTaxRate(6.75);
        order2.setProductType("Tile");
        order2.setArea(2500); 
        order2.setSqFtMaterialCost(3.50);
        order2.setSqFtLaborCost(4.15); 
        order2.setTotalMaterialCost(8750.0);
        order2.setTotalLaborCost(10375.0);
        order2.setTotalTax(1290.9375);
        order2.setTotalTotal(20415.9375);
        order2.setDate("20160122");
        
        order3 = new Order();
        order3.setCustomerName("Crabson");
        order3.setState("IN");
        order3.setTaxRate(6.00);
        order3.setProductType("Wood");
        order3.setArea(1100); 
        order3.setSqFtMaterialCost(5.15);
        order3.setSqFtLaborCost(4.75); 
        order3.setTotalMaterialCost(5665.0);
        order3.setTotalLaborCost(5225.0);
        order3.setTotalTax(653.4);
        order3.setTotalTotal(11543.4);
        order3.setDate("20160122");
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test 
    // public void hello() {}
    
    @Test
    public void removeOrderTest()
    {
        dao.commitOrder(order1);
        dao.commitOrder(order2);
        dao.commitOrder(order3);
        dao.removeOrder(order2.getOrderNum());
        dao.removeOrder(order1.getOrderNum());
        
        Assert.assertEquals(1, dao.returnMap().size());
        
    }
    
    @Test
    public void getOrderListTest()
    {
        dao.commitOrder(order1);
        dao.commitOrder(order2);
        dao.commitOrder(order3);
        
        Integer[] orderList = new Integer[] {1, 2, 3};
        
        Assert.assertArrayEquals(orderList, dao.getOrderList());
    }
    
    @Test
    public void addGetCurrentInfoTest()
    {
        dao.commitOrder(order1);
        
        Order result = dao.getCurrentInfo(order1.getOrderNum());
        
        Assert.assertEquals(order1, result);
    }
    
    @Test
    public void saveLoadCurrentInfo()
    {
        dao.commitOrder(order1);
        dao.commitOrder(order2);
        dao.commitOrder(order3);
        
        try {
            dao.writeCurrentInfo();
        } catch (IOException ex) {
            Assert.fail();
        }
        
        try {
            dao.loadCurrentInfo("20160122");
        } catch (FileNotFoundException ex) {
            Assert.fail();
        }
        
        Integer[] result = dao.getOrderList();
        Integer[] orderList = new Integer[] {1, 2, 3};
        
        Assert.assertArrayEquals(orderList, result);
    }
}
