package com.cput.ac.za;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest
{
    Calculator c = new Calculator();

    //1.i - Object equality
    @Test
    public void testAddition()
    {
        int result = c.addition(10, 20);
        Assert.assertEquals(30, result);
    }

    //1.ii - Object identity
    @Test
    public void testAdd()
    {
        int result = c.addition(10, 20);
        Assert.assertSame(60, result);
    }

    //1.iii - Failing test
    @Test
    public void testSubtraction()
    {
        int result = c.subtraction(30, 20);
        Assert.assertEquals(20, 10);
    }

    //1.iv - Timeout test in milliseconds
    @Test(timeout=5)
    public void testAdditionTimeout()
    {
        int result = c.addition(10, 20);
        Assert.assertEquals(30, result);
    }

    //1.v - Disabling test
    @Ignore
    @Test
    public void testAdditionIgnore()
    {
        int result = c.addition(10, 20);
        Assert.assertEquals(30, result);
    }
}