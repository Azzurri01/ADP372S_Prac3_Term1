package com.cput.ac.za;
import java.util.Random;

public class Application
{
    public static void main(String [] args)
    {
        Calculator calc = new Calculator();
        Random ran = new Random();

        int num1=ran.nextInt(100)+1;
        int num2=ran.nextInt(100)+1;
        int num3;

        //addition
        System.out.println(calc.addition(num1, num2));

        //subtraction
        System.out.println(calc.subtraction(num1, num2));
    }
}
