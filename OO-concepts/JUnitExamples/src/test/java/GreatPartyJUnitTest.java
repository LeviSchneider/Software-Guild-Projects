/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tsg.junitexamples.GreatParty;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class GreatPartyJUnitTest {
    
    public GreatPartyJUnitTest() {
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
    public void TestIsGreatParty30CigarsNoWeekend()
    {
        GreatParty party = new GreatParty();
        
        boolean result = false;
        result = party.greatParty(30, false);
        
        Assert.assertFalse(result);
    }
    
    @Test
    public void TestIsGreatParty50CigarsNoWeekend()
    {
        GreatParty party = new GreatParty();
        
        boolean result = false;
        result = party.greatParty(50, false);
        
        Assert.assertTrue(result);
    }
    
    @Test
    public void TestIsGreatParty70CigarsIsWeekend()
    {
        GreatParty party = new GreatParty();
        boolean result = false;
        result = party.greatParty(70, true);
        
        Assert.assertTrue(result);
    }
}
