/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.flooringmastery.data;

import com.tsg.masterdependency.dao.StateDAO;
import com.tsg.masterdependency.dto.State;
import java.io.FileNotFoundException;
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
public class StateAccessDAOJUnitTest {
    
    StateDAO dao;
    ApplicationContext ctx;
    State state1;
    State state2;
    State state3;
    State state4;
    
    public StateAccessDAOJUnitTest() {
    }
    
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = (StateDAO)ctx.getBean("stateDAO");
        
        state1 = new State();
        state1.setName("OH");
        state1.setTax(6.25);
        
        state2 = new State();
        state2.setName("PA");
        state2.setTax(6.75);
        
        state3 = new State();
        state3.setName("MI");
        state3.setTax(5.75);
        
        state4 = new State();
        state4.setName("IN");
        state4.setTax(6.00);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
//    @Test
//    public void getListOfStatesTest()
//    {
//        
//    }
    
    @Test
    public void loadGetStateAccessTest()
    {
        try {
            dao.loadStates();
        } catch (FileNotFoundException ex) {
            Assert.fail();
        }
        
        State readS1 = dao.getStateInfo(1);
        State readS2 = dao.getStateInfo(2);
        State readS3 = dao.getStateInfo(3);
        State readS4 = dao.getStateInfo(4);
        
        Assert.assertEquals(state1.getTax(), readS1.getTax());
        Assert.assertEquals(state2.getTax(), readS2.getTax());
        Assert.assertEquals(state3.getTax(), readS3.getTax());
        Assert.assertEquals(state4.getTax(), readS4.getTax());
    }
}
