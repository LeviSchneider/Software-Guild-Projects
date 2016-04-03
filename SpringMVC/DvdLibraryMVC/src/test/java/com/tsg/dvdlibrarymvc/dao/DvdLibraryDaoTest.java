/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibrarymvc.dao;

import com.tsg.dvdlibrarymvc.dto.DVD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class DvdLibraryDaoTest {

    private final DvdLibraryDao dao;
    private final DVD dvd1;
    private final ArrayList<String> list1;
    private final ArrayList<String> list2;
    private final ArrayList<String> list3;
    private final DVD dvd2;
    private final DVD dvd3;
    
    public DvdLibraryDaoTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = ctx.getBean("dvdLibraryDao", DvdLibraryDao.class);
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        
        dvd1 = new DVD();
        list1.add("Awesome");
        dvd1.setNotes(list1);
        dvd1.setDirector("Christopher");
        dvd1.setTitle("Prestige");
        dvd1.setStudio("Disney");
        dvd1.setRating("R");
        dvd1.setReleaseDate("20160329");
        
        dvd2 = new DVD();
        list2.add("Horrible");
        dvd2.setNotes(list2);
        dvd2.setDirector("Bay");
        dvd2.setTitle("Transformers");
        dvd2.setStudio("Disney");
        dvd2.setRating("PG13");
        dvd2.setReleaseDate("20081025");
        
        dvd3 = new DVD();
        list3.add("Okay");
        dvd3.setNotes(list3);
        dvd3.setDirector("Shyaliman");
        dvd3.setTitle("Signs");
        dvd3.setStudio("Someone Owned By Disney");
        dvd3.setRating("PG13");
        dvd3.setReleaseDate("20101111");
    }
    
    @Before
    public void setUp() {
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
    public void addGetDeleteDVDs()
    {
        dao.addDVD(dvd1);
        DVD fromDb = dao.getDVDById(dvd1.getDvdId());
        Assert.assertEquals(dvd1, fromDb);
        dao.removeDVD(dvd1.getDvdId());
        Assert.assertNull(dao.getDVDById(dvd1.getDvdId()));
    }
    
    @Test
    public void addUpdateDVD()
    {
        dao.addDVD(dvd1);
        dvd1.setReleaseDate("20120101");
        dao.updateDVD(dvd1);
        DVD fromDb = dao.getDVDById(dvd1.getDvdId());
        Assert.assertEquals(dvd1, fromDb);
    }
    
    @Test
    public void getAllDVDs()
    {
        dao.addDVD(dvd1);
        dao.addDVD(dvd2);
        dao.addDVD(dvd3);
        
        List<DVD> dList = dao.getAllDVDs();
        Assert.assertEquals(3, dList.size());
    }
    
    @Test
    public void searchDVDTest()
    {
        dao.addDVD(dvd1);
        dao.addDVD(dvd2);
        dao.addDVD(dvd3);
        
        Map<SearchTerm, String> criteria = new HashMap<>();
        criteria.put(SearchTerm.TITLE, "Prestige");
        List<DVD> dList = dao.searchDVDs(criteria);
        Assert.assertEquals(1, dList.size());
        Assert.assertEquals(dvd1, dList.get(0));
        
        criteria.put(SearchTerm.TITLE, "Transformers");
        dList = dao.searchDVDs(criteria);
        Assert.assertEquals(1, dList.size());
        Assert.assertEquals(dvd2, dList.get(0));
        
        criteria.put(SearchTerm.STUDIO, "Disney");
        dList = dao.searchDVDs(criteria);
        Assert.assertEquals(1, dList.size());
        Assert.assertEquals(dvd2, dList.get(0));
        
        criteria.put(SearchTerm.RATING, "PG13");
        dList = dao.searchDVDs(criteria);
        Assert.assertEquals(1, dList.size());
        Assert.assertEquals(dvd2, dList.get(0));
    }
}
