/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.stackexample.junit;

import com.tsg.stackexample.ArrayStack;
import com.tsg.stackexample.StackInterface;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class ArrayStackJunit {
    private StackInterface stack;
    private String a, b, c, d, e, f;
    
    public ArrayStackJunit() {
        
        
        
    }
    
    @Before
    public void setUp() {
        stack = new ArrayStack();
        
        a = "a";
        b = "b";
        c = "c";
        d = "d";
        e = "e";
        f = "f";
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
        //Arrange
        
        
        stack.push(a);
        Assert.assertEquals(1, stack.size());
        stack.push(b);
        Assert.assertEquals(2, stack.size());
        stack.push(c);
        Assert.assertEquals(3, stack.size());
        stack.push(d);
        Assert.assertEquals(4, stack.size());
        stack.push(e);
        Assert.assertEquals(5, stack.size());
        stack.push(f);
        Assert.assertEquals(6, stack.size());
    }
    
    @Test
    public void popTest()
    {   
        //Arrange
        stack.push(a);
        stack.push(b);
        stack.push(c);
        stack.push(d);
        stack.push(e);
        stack.push(f);
        //Assert/Act
        stack.pop();
        Assert.assertEquals(5, stack.size());
        stack.pop();
        Assert.assertEquals(4, stack.size());
        stack.pop();
        Assert.assertEquals(3, stack.size());
        stack.pop();
        Assert.assertEquals(2, stack.size());
        stack.pop();
        Assert.assertEquals(1, stack.size());
        stack.pop();
        Assert.assertEquals(0, stack.size());
    }
    
    @Test
    public void size()
    {
        //Arrange
        stack.push(a);
        stack.push(b);
        stack.push(c);
        stack.push(d);
        stack.push(e);
        stack.push(f);
        
        //Act/Assert
        Assert.assertEquals(6, stack.size());
        
        //Arrange
        stack.pop();       
        stack.pop();       
        stack.pop();       
        stack.pop();       
        stack.pop();       
        stack.pop();
        
        //Act/Assert
        Assert.assertEquals(0, stack.size());
    }
    
    @Test
    public void isEmptyTest()
    {
        //Arrange
        stack.push(a);
        stack.push(b);
        stack.push(c);
        stack.push(d);
        stack.push(e);
        stack.push(f);
        
        //Act/Assert
        Assert.assertEquals(6, stack.size());
        
        //Arrange
        stack.pop();       
        stack.pop();       
        stack.pop();       
        stack.pop();       
        stack.pop();       
        stack.pop();
        
        //Act/Assert
        Assert.assertTrue(stack.isEmpty());
    }
    
    @Test
    public void resizeTest()
    {
        //Arrange
        stack.push(a);
        stack.push(b);
        stack.push(c);
        stack.push(d);
        stack.push(e);
        stack.push(f);
        
        Assert.assertEquals(6, stack.size());
        
        //Arrange
        stack.pop();       
        stack.pop();       
        stack.pop();       
        stack.pop();       
        stack.pop();       
        stack.pop();
        
        Assert.assertTrue(stack.isEmpty());
    }
}
