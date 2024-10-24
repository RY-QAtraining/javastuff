package org.lbg.c4;

import java.io.IOException;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        //take input from a user and print it out
        int counter = 0;
        char val;
        try {
            while ((val = (char) System.in.read()) != -1) {
                System.out.println("Char entered: " + Integer.toHexString(val));
                counter++;
            }
            System.out.println("No. of characters "+counter);
        }
        catch (IOException e) {
                throw new RuntimeException(e);
            }


    }
}
