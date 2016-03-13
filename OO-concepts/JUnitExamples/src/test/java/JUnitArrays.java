/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.tsg.junitexamples.JUnitDrills1;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Levi Schneider
 */
public class JUnitArrays {
    
    public JUnitArrays() {
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
    public void FirstLastArrayTrue()
    {
        JUnitDrills1 testing = new JUnitDrills1();
        int[] array1 = {1, 2, 6};
        int[] array2 = {6, 1, 2, 3};
        int[] array3 = {13, 6, 1, 2, 3};
        boolean result = false;
        result = testing.FirstLast6(array1);
        Assert.assertTrue(result);
        result = testing.FirstLast6(array2);
        Assert.assertTrue(result);
        result = testing.FirstLast6(array3);
        Assert.assertFalse(result);
    }
    
    @Test
    public void ArrayFirstEqualsLast()
    {
        JUnitDrills1 testing = new JUnitDrills1();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 1};
        int[] array3 = {1, 2, 1}; 
        boolean result = false;
        result = testing.SameFirstLast(array1);
        Assert.assertFalse(result);
        result = testing.SameFirstLast(array2);
        Assert.assertTrue(result);
        result = testing.SameFirstLast(array3);
        Assert.assertTrue(result);
    }
    
    @Test
    public void BakingPie()
    {
        
        JUnitDrills1 testing = new JUnitDrills1();
        double value = Math.PI * Math.pow(10, 20);
        int[] result = testing.MakePi(value);
        boolean fact = true;
        
        if(result[1] == 1)
        {
            fact = true;
        }
        Assert.assertTrue(fact);
    }
    
    @Test
    public void commonEnd()
    {
        JUnitDrills1 test = new JUnitDrills1();
        int[] array1A = {1, 2, 3};
        int[] array1B = {7, 3};
        
        int[] array2A = {1, 2, 3};
        int[] array2B = {7, 3, 2};
        
        int[] array3A = {1, 2, 3};
        int[] array3B = {1, 3};
        boolean result = false;
        result = test.commonEnd(array1A, array1B);
        Assert.assertTrue(result);
        result = test.commonEnd(array2A, array2B);
        Assert.assertFalse(result);
        result = test.commonEnd(array3A, array3B);
        Assert.assertTrue(result);
    }
    
    @Test
    public void Sum()
    {
        JUnitDrills1 test = new JUnitDrills1();
        int[] array1 = {1, 2, 3};
        int[] array2 = {5, 11, 2};
        int[] array3 = {7, 0, 0};
        boolean fact = false;
        int result = test.Sum(array1);
        if(result == 6)
        {
            fact = true;
        }
        else
        {
            fact = false;
        }
        Assert.assertTrue(fact);
        
        result = test.Sum(array2);
        if(result == 18)
        {
            fact = true;
        }
        else
        {
            fact = false;
        }
        Assert.assertTrue(fact);
        
        result = test.Sum(array3);
        if(result == 7)
        {
            fact = true;
        }
        else
        {
            fact = false;
        }
        Assert.assertTrue(fact);
    }
    
    @Test
    public void toTheLeft()
    {
        JUnitDrills1 test = new JUnitDrills1();
        int[] array1 = {1, 2, 3};
        int[] arrayA = {2, 3, 1};
        int[] array2 = {5, 11, 9};
        int[] arrayB = {11, 9, 5};
        int[] array3 = {7, 0, 0};
        int[] arrayC = {0, 0, 7};
        boolean fact = false;
        
        int[] result = test.RotateLeft(array1);
        if(result == arrayA){fact = true;}
        else{fact = false;}
        Assert.assertTrue(fact);
        
        result = test.RotateLeft(array2);
        if(result == arrayB){fact = true;}
        else{fact = false;}
        Assert.assertTrue(fact);
        
        result = test.RotateLeft(array3);
        if(result == arrayC){fact = true;}
        else{fact = false;}
        Assert.assertTrue(fact);
    }
    
    @Test
    public void reverseOrder()
    {
        JUnitDrills1 test = new JUnitDrills1();
        int[] array1 = {1,2,3};
        int[] result1 = {3,2,1};
        
        boolean fact = false;
        
        int[] result = test.Reverse(array1);
        if(result == result1){fact = true;}
        else{fact = false;}
        Assert.assertTrue(fact);
    }
}
