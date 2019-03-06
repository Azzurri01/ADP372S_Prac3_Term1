package com.cput.ac.za;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest
{
    Multiplication m = new Multiplication();

    //1.i - Object equality
    @Test
    public void testMultiply_ObjectEquality()
    {
        int result = m.multiply(10, 20);
        Assert.assertEquals(200, result);
    }

    //1.ii - Object identity
    @Test
    public void testMultiply_ObjectIdentity()
    {
        int result = m.multiply(10, 20);
        Assert.assertSame(200, result);
    }

    //1.iii - Failing test
    @Test
    public void testMultiply_FailingTest()
    {
        int result = m.multiply(30, 20);
        Assert.assertEquals(20, result);
    }

    //1.iv - Timeout test in milliseconds
    @Test(timeout=2)
    public void testMultiply_Timeout()
    {
        for(int i=0; i<50; i++)
        {
            System.out.println(i);
        }

        int result = m.multiply(10, 20);
        Assert.assertEquals(200, result);
    }

    //1.v - Disabling test
    @Ignore
    @Test
    public void testMultiply_IgnoreTest()
    {
        int result = m.multiply(10, 20);
        Assert.assertEquals(200, result);
    }

}