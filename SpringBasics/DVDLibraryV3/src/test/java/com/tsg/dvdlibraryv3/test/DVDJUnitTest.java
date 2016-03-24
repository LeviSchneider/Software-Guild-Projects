/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibraryv3.test;
import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.io.FileNotFoundException;
import java.time.LocalDate;
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
public class DVDJUnitTest {
    Dvd dvd, dvd2, dvd3;
    ApplicationContext ctx;
    DvdLibraryDao libDAO;
    String date1, date2, date3;
    
    public DVDJUnitTest() {
    }
    
    @Before
    public void setUp() throws FileNotFoundException {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        libDAO = (DvdLibraryDao)ctx.getBean("superDAO");
        //libDAO.loadLibrary();
        date1 = "20101212";
        dvd = new Dvd();
        dvd.setId(1);
        dvd.setDirector("Dave");
        dvd.setNote("5 Stars");
        dvd.setMpaaRating("R");
        dvd.setStudio("Disney");
        dvd.setReleaseDate(LocalDate.now());
        dvd.setTitle("Lion King Reloaded");
        
        date2 = "20121212";
        dvd2 = new Dvd();
        dvd2.setId(2);
        dvd2.setDirector("Johnny");
        dvd2.setNote("6 Stars");
        dvd2.setMpaaRating("PG13");
        dvd2.setStudio("Disney");
        dvd2.setReleaseDate(LocalDate.now());
        dvd2.setTitle("The Avengers Rise of Thanos");
        
        date3 = "20160112";
        dvd3 = new Dvd();
        dvd3.setId(3);
        dvd3.setDirector("M. Night Shyaliman");
        dvd3.setNote("Kill it with fire.");
        dvd3.setMpaaRating("R");
        dvd3.setStudio("Someone owned by disney");
        dvd3.setReleaseDate(LocalDate.now());
        dvd3.setTitle("Levi the Reckoning");
        
    }
    
    @After
    public void tearDown() {
        
    }
    
    @Test
    public void createDVDTest()
    { 
        
        libDAO.add(dvd);
        Assert.assertEquals(dvd.getTitle(), libDAO.getById(dvd.getId()).getTitle());
        Assert.assertEquals(1, libDAO.listAll().size());
        libDAO.add(dvd2);
        Assert.assertEquals(dvd2.getTitle(), libDAO.getById(dvd2.getId()).getTitle());
        Assert.assertEquals(2, libDAO.listAll().size());
    }
    
    @Test
    public void removeDVDTest()
    {
        libDAO.add(dvd);
        libDAO.add(dvd2);
        libDAO.add(dvd3);
        Assert.assertEquals(3, libDAO.listAll().size());
        libDAO.remove(dvd.getId());
        Assert.assertEquals(2, libDAO.listAll().size());
        libDAO.remove(dvd2.getId());
        Assert.assertEquals(1, libDAO.listAll().size());
        libDAO.remove(dvd3.getId());
        Assert.assertEquals(0, libDAO.listAll().size());
    }
    
    @Test
    public void getDVDTest()
    {
        
        libDAO.add(dvd);
        Assert.assertEquals(dvd, libDAO.getById(dvd.getId()));
        libDAO.add(dvd2);
        Assert.assertEquals(dvd2, libDAO.getById(dvd2.getId()));
        libDAO.add(dvd3);
        Assert.assertEquals(dvd3, libDAO.getById(dvd3.getId()));
    }
    
    @Test
    public void searchByTitleTest()
    {
        libDAO.add(dvd);
        libDAO.add(dvd2);
        libDAO.add(dvd3);
        String title = libDAO.getByTitle("Lion King Reloaded").get(0).getTitle();
        String title2 = libDAO.getByTitle("The Avengers Rise of Thanos").get(0).getTitle();
        String title3 = libDAO.getByTitle("Levi the Reckoning").get(0).getTitle();
        Assert.assertEquals(dvd.getTitle(), title);
        Assert.assertEquals(dvd2.getTitle(), title2);
        Assert.assertEquals(dvd3.getTitle(), title3);
    }

    
    @Test
    public void searchByStudioTest()
    {
        libDAO.add(dvd);
        libDAO.add(dvd2);
        libDAO.add(dvd3);
        
        Assert.assertEquals(dvd.getStudio(), libDAO.getByStudio("Disney").get(0).getStudio());
        Assert.assertEquals(dvd2.getStudio(), libDAO.getByStudio("Disney").get(0).getStudio());
        Assert.assertEquals(dvd3.getStudio(), libDAO.getByStudio("Someone owned by disney").get(0).getStudio());
    }
    
    @Test
    public void searchByRatingTest()
    {
        libDAO.add(dvd);
        libDAO.add(dvd2);
        libDAO.add(dvd3);
        
        Assert.assertEquals(dvd.getMpaaRating(), libDAO.getByRating("R").get(0).getMpaaRating());
        Assert.assertEquals(dvd2.getMpaaRating(), libDAO.getByRating("PG13").get(0).getMpaaRating());
        Assert.assertEquals(dvd3.getMpaaRating(), libDAO.getByRating("R").get(0).getMpaaRating());
    }
}
