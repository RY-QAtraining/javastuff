package org.lbg.c4;

import java.io.IOException;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        // data types
        int x = 0xfffffff;
        System.out.println("Hello world "+x);

        short s = 14;
        s = (short) x;
        System.out.println("Hello world "+s);

        // loops
        int y = 0;
        while ((y=y+1)<2)
        {
            System.out.println("Hello "+ y);
        };

        do {
            System.out.println(y);
        }while(y<2);

        for (int z=0; z<2; z++)
        {
            System.out.println("Hello " + z);
        };

        //take input from a user and print it out
        // note here the output is the ascii value in base 10,  to output char entered, change the type for val to char and force the type of System.in.read(0 to char
        int counter = 0;
        int val;
        try {
            while ((val = System.in.read()) != -1) {
                System.out.println("Char entered: " + val);
                counter++;
            }
            System.out.println("No. of characters "+counter);
        }
        catch (IOException e) {
                throw new RuntimeException(e);
            }


    }
}
