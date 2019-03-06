package com.cput.ac.za;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest
{
    Subtraction s = new Subtraction();

    //1.i - Object equality
    @Test
    public void testAdd_ObjectEquality()
    {
        int result = s.subtract(10, 20);
        Assert.assertEquals(10, result);
    }


    //1.ii - Object identity
    @Test
    public void testSubtract_ObjectIdentity()
    {
        int result = s.subtract(10, 20);
        assertSame(10, result);
    }

    //1.iii - Failing test
    @Test
    public void testSubtract_FailingTest()
    {
        int result = s.subtract(30, 20);
        Assert.assertEquals(20, result);
    }

    //1.iv - Timeout test in milliseconds
    @Test(timeout=2)
    public void testSubtract_Timeout()
    {
        for(int i=0; i<80; i++)
        {
            System.out.println(i);
        }

        int result = s.subtract(10, 20);
        Assert.assertEquals(10, result);
    }

    //1.v - Disabling test
    @Ignore
    @Test
    public void testSubtract_IgnoreTest()
    {
        int result = s.subtract(10, 20);
        Assert.assertEquals(10, result);
    }
}