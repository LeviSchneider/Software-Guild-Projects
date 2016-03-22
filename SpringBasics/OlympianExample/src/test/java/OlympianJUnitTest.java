/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tsg.olympianexample.SkiJumper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class OlympianJUnitTest {
    
    public OlympianJUnitTest() {
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
    public void skiJumperTest()
    {
        SkiJumper jumper = new SkiJumper();
        Assert.assertEquals(jumper.competeInEvent(), "SkiJump");
    }
    
    @Test
    public void SkiJumperCTXTest()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SkiJumper sj = (SkiJumper) ctx.getBean("superSkiJumper");
        Assert.assertEquals(sj.competeInEvent(), "SkiJump");
    }
}
