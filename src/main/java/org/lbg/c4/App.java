package org.lbg.c4;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        // takes user input and read it + convert to latin characters
        InputStreamReader isr = new InputStreamReader(System.in);
        // keeps track of the no. of lines read
        LineNumberReader lnr = new LineNumberReader(isr);

        try {
            while (lnr.readLine() != null)
                ;
            System.out.println("No. of lines "+lnr.getLineNumber());
        }
        catch (IOException e) {
                throw new RuntimeException(e);
            }


    }
}
