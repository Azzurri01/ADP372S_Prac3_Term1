package com.cput.ac.za;
import com.sun.org.apache.xpath.internal.operations.Div;

import javax.swing.*;
import java.util.Random;

public class Application
{
    public static void main(String [] args)
    {
        //Initialise class objects
        Addition ad = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mult = new Multiplication();
        Division div = new Division();

        //Generate 2 random number to perform calculations
        Random ran = new Random();
        int num1=ran.nextInt(100)+1;
        int num2=ran.nextInt(100)+1;
        int remainder=num1%num2;
        int num3;

        //Ensure that biggest number is listed first for subtraction and division purposes
        if(num1<num2)
        {
            num3=num2;
            num1=num2;
            num2=num3;
        }

        //Build string and output into 1 JoptionPane window
        StringBuilder builder = new StringBuilder();
        builder.append("Practical 3 - Calculator Test\n-----------------------------------------");
        builder.append("\nAddition: " + num1 + "+" + num2 + "=" + ad.add(num1, num2));
        builder.append("\nSubtraction: " + num1 + "-" + num2 + "=" + sub.subtract(num1, num2));
        builder.append("\nMultiplication: " + num1 + "x" + num2 + "=" + mult.multiply(num1, num2));
        builder.append("\nDivision: " + num1 + "/" + num2 + "=" + div.divide(num1, num2) + "." + remainder);
        JOptionPane.showMessageDialog(null, builder.toString(), "Dimitri_Johannes_PT_Practical3", JOptionPane.INFORMATION_MESSAGE);
    }
}
