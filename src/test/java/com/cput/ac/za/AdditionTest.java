package com.cput.ac.za;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest
{
    Addition a = new Addition();

    //1.i - Object equality
    @Test
    public void testAdd_ObjectEquality()
    {
        int result = a.add(10, 20);
        Assert.assertEquals(30, result);
    }

    //1.ii - Object identity
    @Test
    public void testAdd_ObjectIdentity()
    {
        int result = a.add(10, 20);
        Assert.assertSame(30, result);
    }

    //1.iii - Failing test
    @Test
    public void testAdd_FailingTest()
    {
        int result = a.add(30, 20);
        Assert.assertEquals(20, result);
    }

    //1.iv - Timeout test in milliseconds
    @Test(timeout=2)
    public void testAdd_Timeout()
    {
        for(int i=0; i<50; i++)
        {
            System.out.println(i);
        }

        int result = a.add(10, 20);
        Assert.assertEquals(30, result);
    }

    //1.v - Disabling test
    @Ignore
    @Test
    public void testAdd_IgnoreTest()
    {
        int result = a.add(10, 20);
        Assert.assertEquals(30, result);
    }
}