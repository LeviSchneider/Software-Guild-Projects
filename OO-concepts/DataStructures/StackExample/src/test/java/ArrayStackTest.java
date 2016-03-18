/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tsg.stackexample.ArrayStack;
import com.tsg.stackexample.StackInterface;
import java.util.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class ArrayStackTest {
    StackInterface stack;
    private static final int DEFAULT_INITIAL_SIZE = 4;
    private Object[] items;
    private int numItems = 0;
    private String one, two, three, four, five, six, seven, eight;
    public ArrayStackTest() {
        
    }
    
    @Before
    public void setUp() {
        stack = new ArrayStack();
        
        one = "1";
        two = "2";
        three = "3";
        four = "4";
        five = "5";
        six = "6";
        seven = "7";
        eight = "8";
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
    public void pushTest()
    { 
        stack.push(one);
        stack.push(two);
        stack.push(three);
        stack.push(four);
        stack.push(five);
        
        Assert.assertEquals(stack.size(), 5);
    }
    
    @Test
    public void popTest()
    {
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        Assert.assertEquals(stack.size(), 0);
        
    }
    
    @Test
    public void resizeTest()
    {
        stack.push(one);
        stack.push(two);
        stack.push(three);
        stack.push(four);
        stack.push(five);
        stack.push(six);
        stack.push(seven);
        stack.push(eight);
        
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        Assert.assertEquals(stack.size(), 4);
    }
    
    @Test
    public void isEmptyTest()
    {
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        Assert.assertTrue(stack.isEmpty());
        
        stack.push(one);
        
        Assert.assertFalse(stack.isEmpty());
    }
    
    @Test
    public void iteratorTest()
    {
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        Iterator itr = stack.iterator();
        Assert.assertNotNull(stack.iterator());
        Object o = new Object();
        while(itr.hasNext())
        {
            o = itr.next();
        }
        
        Assert.assertNotNull(stack.iterator());
        
    }
}
