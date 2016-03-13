/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tsg.junitexamples.JUnitConditional;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class JUnitConditionalTest {

    public JUnitConditionalTest() {
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
    public void thereBeTrouble() {
        boolean conditionA = true;
        boolean conditionB = true;
        boolean conditionC = false;
        boolean conditionD = false;
        JUnitConditional cond = new JUnitConditional();
        boolean fact = cond.AreWeInTrouble(conditionA, conditionB);
        Assert.assertTrue(fact);
        fact = cond.AreWeInTrouble(conditionC, conditionD);
        Assert.assertTrue(fact);
        fact = cond.AreWeInTrouble(conditionB, conditionC);
        Assert.assertFalse(fact);

    }

    @Test
    public void sleepTime() {
        JUnitConditional cond = new JUnitConditional();
        boolean conditionA = true;
        boolean conditionB = true;
        boolean conditionC = false;
        boolean conditionD = false;

        boolean fact = cond.CanSleepIn(conditionC, conditionD);
        Assert.assertTrue(fact);
        fact = cond.CanSleepIn(conditionA, conditionD);
        Assert.assertFalse(fact);
        fact = cond.CanSleepIn(conditionD, conditionA);
        Assert.assertTrue(fact);
    }

    @Test
    public void sumDoubleTest() {
        JUnitConditional cond = new JUnitConditional();
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 2;
        int result = cond.SumDouble(a, b);
        Assert.assertEquals((a + b), result);
        result = cond.SumDouble(b, c);
        Assert.assertEquals((b + c), result);
        result = cond.SumDouble(b, d);
        Assert.assertEquals(2 * (b + d), result);
    }

    @Test
    public void diff21Test() {
        JUnitConditional cond = new JUnitConditional();
        int resultOne = cond.Diff21(23);
        int resultTwo = cond.Diff21(10);
        int resultThree = cond.Diff21(21);

        Assert.assertEquals(resultOne, 2);
        Assert.assertEquals(resultTwo, 11);
        Assert.assertEquals(resultThree, 0);
    }

    @Test
    public void parrotTroubleTest() {
        JUnitConditional cond = new JUnitConditional();
        boolean fact = true;
        boolean fiction = false;
        int timeA = 6;
        int timeB = 7;
        boolean result = cond.ParrotTrouble(fact, timeA);
        Assert.assertTrue(result);
        result = cond.ParrotTrouble(fact, timeB);
        Assert.assertFalse(result);
        result = cond.ParrotTrouble(fiction, timeA);
        Assert.assertFalse(result);
    }

    @Test
    public void make10Test() {
        JUnitConditional cond = new JUnitConditional();
        boolean result = cond.Makes10(9, 10);
        Assert.assertTrue(result);
        result = cond.Makes10(9, 9);
        Assert.assertFalse(result);
        result = cond.Makes10(9, 1);
        Assert.assertTrue(result);
    }

    @Test
    public void nearHundredTest() {
        JUnitConditional cond = new JUnitConditional();
        boolean result = cond.NearHundred(103);
        Assert.assertTrue(result);
        result = cond.NearHundred(90);
        Assert.assertTrue(result);
        result = cond.NearHundred(83);
        Assert.assertFalse(result);
    }
    
    @Test
    public void posNegTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertTrue(cond.PosNeg(-1, 1, false));
        Assert.assertTrue(cond.PosNeg(1, -1, false));
        Assert.assertTrue(cond.PosNeg(-1, -1, true));
    }
    
    @Test
    public void notStringTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.NotString("not bad"), "not bad");
        Assert.assertEquals(cond.NotString("candy"), "not candy");
        Assert.assertEquals(cond.NotString("Levi"), "not Levi");
    }
    
    @Test
    public void missingCharTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.MissingChar("kitten", 0), "itten");
        Assert.assertEquals(cond.MissingChar("kitten", 4), "kittn");
        Assert.assertEquals(cond.MissingChar("kitten", 3), "kiten");
    }
    
    @Test
    public void frontBackTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.FrontBack("ozzy"), "yzzo");
        Assert.assertEquals(cond.FrontBack("khfs"), "shfk");
        Assert.assertEquals(cond.FrontBack("Train"), "nraiT");
        Assert.assertEquals(cond.FrontBack("human"), "numah");
    }
    
    @Test
    public void front3Test()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.Front3("ozzy"), "ozzozzozz");
        Assert.assertEquals(cond.Front3("hello"), "helhelhel");
        Assert.assertEquals(cond.Front3("right"), "rigrigrig");
        Assert.assertEquals(cond.Front3("does"), "doedoedoe");
    }
    
    @Test
    public void backgroundTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.BackAround("hi"), "ihii");
        Assert.assertEquals(cond.BackAround("what"), "twhatt");
        Assert.assertEquals(cond.BackAround("does"), "sdoess");
        Assert.assertEquals(cond.BackAround("as"), "sass");
    }
    
    @Test 
    public void multiple3or5Test()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertTrue(cond.Multiple3or5(15));
        Assert.assertTrue(cond.Multiple3or5(9));
        Assert.assertFalse(cond.Multiple3or5(8));
    }
    
    @Test
    public void startHiTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertTrue(cond.StartHi("hi yall"));
        Assert.assertTrue(cond.StartHi("hi"));
        Assert.assertFalse(cond.StartHi("high"));
    }
    
    @Test
    public void icyHotTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertTrue(cond.IcyHot(-32, 120));
        Assert.assertFalse(cond.IcyHot(-32, 98));
        Assert.assertTrue(cond.IcyHot(-42, 200));
    }
    
    @Test
    public void between10and20Test()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertTrue(cond.Between10and20(0, 12));
        Assert.assertTrue(cond.Between10and20(14, 21));
        Assert.assertFalse(cond.Between10and20(0, 80));
    }
    
    @Test
    public void hasTeenTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertTrue(cond.HasTeen(12, 24, 14));
        Assert.assertTrue(cond.HasTeen(18, 24, 14));
        Assert.assertFalse(cond.HasTeen(12, 24, 29));
    }
    
    @Test
    public void soAloneTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertTrue(cond.SoAlone(14, 99));
        Assert.assertTrue(cond.SoAlone(18, 99));
        Assert.assertFalse(cond.SoAlone(13, 16));
    }
    
    @Test
    public void removeDelTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.RemoveDel("Adele"), "Ae");
        Assert.assertEquals(cond.RemoveDel("delete"), "ete");
        Assert.assertEquals(cond.RemoveDel("Randel"), "Ran");
    }
    
    @Test
    public void ixStartTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertTrue(cond.IxStart("six"));
        Assert.assertTrue(cond.IxStart("pix"));
        Assert.assertFalse(cond.IxStart("siz"));
    }
    
    @Test
    public void startOzTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.StartOz("ozzy"), "oz");
        Assert.assertEquals(cond.StartOz("azzy"), "z");
        Assert.assertEquals(cond.StartOz("onward"), "o");
        
    }
    
    @Test
    public void maxTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.Max(1, 2, 45), 45);
        Assert.assertEquals(cond.Max(4, 2, 3), 4);
        Assert.assertEquals(cond.Max(300, 20, 45), 300);
    }
    
    @Test
    public void closerTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.Closer(6, 9), 9);
        Assert.assertEquals(cond.Closer(13, 4), 13);
        Assert.assertEquals(cond.Closer(24, -1), -1);
    }
    
    @Test
    public void gotETest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertFalse(cond.GotE("Tennessee"));
        Assert.assertTrue(cond.GotE("Hello"));
        Assert.assertTrue(cond.GotE("Seen"));
    }
    
    @Test
    public void endUpTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.EndUp("Hello"), "HeLLO");
    }
    
    @Test
    public void everyNthTest()
    {
        JUnitConditional cond = new JUnitConditional();
        Assert.assertEquals(cond.EveryNth("Test", 3), "T");
        Assert.assertEquals(cond.EveryNth("English", 4), "Eng");
        Assert.assertEquals(cond.EveryNth("Conditional", 5), "Condit");
    }
}
