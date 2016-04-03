/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.addressbookmvc.dao;

import com.tsg.addressbookmvc.dto.Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class AddressBookDaoTest {

    private AddressBookDao dao;
    private Address na1;
    private Address na2;
    private Address na3;
    
    public AddressBookDaoTest() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = ctx.getBean("addressBookDao", AddressBookDao.class);
        
        na1 = new Address();
        na1.setName("Dave");
        na1.setState("Ohio");
        na1.setCity("Akron");
        na1.setAddressLine1("123 Something Rd");
        na1.setAddressLine2("Apartment A");
        na1.setZipCode("12345");
        
        na2 = new Address();
        na2.setName("Joe");
        na2.setState("Pennsylvania");
        na2.setCity("Pittsburgh");
        na2.setAddressLine1("123 Pitt Rd");
        na2.setAddressLine2("Apartment Z");
        na2.setZipCode("54321");
        
        na3 = new Address();
        na3.setName("Rick");
        na3.setState("Ohio");
        na3.setCity("Cincinnati");
        na3.setAddressLine1("425 What Rd");
        na3.setAddressLine2("Apartment D");
        na3.setZipCode("44444");
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
    public void addGetDeleteAddress()
    {
        dao.addAddress(na1);
        Address fromDb = dao.getAddressById(na1.getAddressId());
        Assert.assertEquals(fromDb, na1);
        dao.removeAddress(na1.getAddressId());
        Assert.assertNull(dao.getAddressById(na1.getAddressId()));
    }
    
    @Test
    public void addUpdateContact()
    {
        dao.addAddress(na1);
        na1.setZipCode("99999");
        
        dao.updateAddress(na1);
        
        Address fromDb = dao.getAddressById(na1.getAddressId());
        
        Assert.assertEquals(na1, fromDb);
    }
    
    @Test
    public void getAllContacts()
    {
        dao.addAddress(na1);
        dao.addAddress(na2);
        dao.addAddress(na3);
        
        List<Address> aList = dao.getAllAddresses();
        Assert.assertEquals(3, aList.size());
    }
    
    @Test
    public void searchTestContacts()
    {
        dao.addAddress(na1);
        dao.addAddress(na2);
        dao.addAddress(na3);
        
        Map<SearchTerm, String> criteria = new HashMap<>();
        
        criteria.put(SearchTerm.CITY, "Pittsburgh");
        List<Address> aList = dao.searchAddresses(criteria);
        Assert.assertEquals(1, aList.size());
        Assert.assertEquals(na2, aList.get(0));
        
        criteria.put(SearchTerm.CITY, "Cincinnati");
        aList = dao.searchAddresses(criteria);
        Assert.assertEquals(1, aList.size());
        Assert.assertEquals(na3, aList.get(0));
        
        criteria.put(SearchTerm.STATE, "Ohio");
        aList = dao.searchAddresses(criteria);
        Assert.assertEquals(1, aList.size());
        
        criteria.put(SearchTerm.STATE, "Pennsylvania");
        aList = dao.searchAddresses(criteria);
        Assert.assertEquals(0, aList.size());
    }
}
