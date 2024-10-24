package org.lbg.c4;

import javax.sound.sampled.Line;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        App app = new App();
        app.processInput();

    }
    public void processInput(){
        // takes user input and read it + convert to latin characters
        InputStreamReader isr = new InputStreamReader(System.in);
        // keeps track of the no. of lines read
        LineNumberReader lnr = new LineNumberReader(isr);
        ArrayList<LineItem> lines = new ArrayList<>();

        try {
            String line;
            int lineNo = 0;
            while (prompt() && (line=lnr.readLine())!= null){
                LineItem li = new LineItem(++lineNo,line);
                lines.add(li);
            }

            System.out.println("No. of lines "+lnr.getLineNumber());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*
        for (int idx = 0; idx< lines.size(); idx++)
            System.out.println("Line:" + (idx+1) + "values:" + lines.get(idx));*/

        int idx =0;
        lines.forEach(ll ->{
            System.out.println(ll);
        });
    }
    public boolean prompt(){
        System.out.println("Enter an item");
        return true;
    }
}
