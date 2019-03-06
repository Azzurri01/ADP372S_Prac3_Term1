package com.cput.ac.za;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest 
{
    Division d = new Division();

    //1.i - Object equality
    @Test
    public void testDivide_ObjectEquality()
    {
        int result = d.divide(20, 10);
        Assert.assertEquals(2, result);
    }

    //1.ii - Object identity
    @Test
    public void testDivide_ObjectIdentity()
    {
        int result = d.divide(20, 10);
        Assert.assertSame(2, result);
    }

    //1.iii - Failing test
    @Test
    public void testDivide_FailingTest()
    {
        int result = d.divide(40, 20);
        Assert.assertEquals(5, result);
    }

    //1.iv - Timeout test in milliseconds
    @Test(timeout=2)
    public void testDivide_Timeout()
    {
        for(int i=0; i<50; i++)
        {
            System.out.println(i);
        }

        int result = d.divide(50, 25);
        Assert.assertEquals(2, result);
    }

    //1.v - Disabling test
    @Ignore
    @Test
    public void testDivide_IgnoreTest()
    {
        int result = d.divide(100, 20);
        Assert.assertEquals(5, result);
    }
}