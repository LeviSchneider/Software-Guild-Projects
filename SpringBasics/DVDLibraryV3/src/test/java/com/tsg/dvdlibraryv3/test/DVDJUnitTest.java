/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibraryv3.test;
import com.swcguild.dvdlibrary.dto.Dvd;
import com.tsg.dvdlibraryv3.dao.DVDLibraryVDAO;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class DVDJUnitTest {
    Dvd dvd, dvd2, dvd3;
    DVDLibraryVDAO libDAO;
    String date1, date2, date3;
    
    public DVDJUnitTest() {
    }
    
    @Before
    public void setUp() throws FileNotFoundException {
        libDAO = new DVDLibraryVDAO();
        //libDAO.loadLibrary();
        date1 = "20101212";
        dvd = new Dvd();
        dvd.setDirector("Dave");
        dvd.setId(libDAO.getHighestIndex());
        dvd.setNote("5 Stars");
        dvd.setMpaaRating("R");
        dvd.setStudio("Disney");
        dvd.setReleaseDate(LocalDate.now());
        dvd.setTitle("Lion King Reloaded");
        
        date2 = "20121212";
        dvd2 = new Dvd();
        dvd2.setDirector("Johnny");
        dvd2.setId(libDAO.getHighestIndex());
        dvd2.setNote("6 Stars");
        dvd2.setMpaaRating("PG13");
        dvd2.setStudio("Disney");
        dvd2.setReleaseDate(LocalDate.now());
        dvd2.setTitle("The Avengers Rise of Thanos");
        
        date3 = "20160112";
        dvd3 = new Dvd();
        dvd3.setDirector("M. Night Shyaliman");
        dvd3.setId(libDAO.getHighestIndex());
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
        int num = libDAO.getNumberOfDVDs();
        Assert.assertEquals(1, libDAO.getNumberOfDVDs().intValue());
    }
    
    @Test
    public void getNumberandRemoveTest()
    {
        libDAO.add(dvd2);
        
        libDAO.remove(0);
        
        Assert.assertEquals(0, libDAO.getNumberOfDVDs().intValue());
    }
    
    @Test
    public void getDVDTest()
    {
        
        libDAO.add(dvd);
        
        Assert.assertEquals(dvd, libDAO.getDvd(0));
    }
    
    @Test
    public void searchByTitleTest()
    {
        libDAO.add(dvd);
        
        String title = libDAO.getByTitle("Lion King Reloaded").get(0).getTitle();
        
        Assert.assertEquals(dvd.getTitle(), title);
    }
    
    @Test
    public void searchByDirectorTest()
    {
        libDAO.add(dvd3);
        
        String name = libDAO.getByDirector("M. Night Shyaliman").get(0).getDirector();
        Assert.assertEquals(dvd3.getDirector(), libDAO.getByDirector("M. Night Shyaliman").get(0).getDirector());
    }
    
    @Test
    public void searchByStudioTest()
    {
        libDAO.add(dvd2);
        Assert.assertEquals(dvd2.getStudio(), libDAO.getByStudio("Disney").get(0).getStudio());
    }
    
    @Test
    public void searchByRatingTest()
    {
        libDAO.add(dvd);
        
        Assert.assertEquals(dvd.getMpaaRating(), libDAO.getByRating("R").get(0).getMpaaRating());
    }
    
    @Test
    public void findNewestDVDTest()
    {
        libDAO.add(dvd);
        
        Assert.assertEquals(dvd.getTitle(), libDAO.findNewestDVD().get(0).getTitle());
    }
    
    @Test 
    public void findOldestDVDTest()
    {
        libDAO.add(dvd);
        
        Assert.assertEquals(dvd.getMpaaRating(), libDAO.findOldestDVD().get(0).getMpaaRating());
    }
}
