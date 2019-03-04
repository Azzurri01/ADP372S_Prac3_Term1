package com.cput.ac.za;

public class Calculator
{
    public int addition(int a, int b)
    {
        return a+b;
    }

    public int subtraction(int a, int b)
    {
        int c;

        if(b>a)
        {
            c=b;
            b=a;
            a=c;
        }
        return a-b;
    }
}
