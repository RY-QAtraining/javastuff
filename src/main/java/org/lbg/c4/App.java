package org.lbg.c4;

import org.lbg.unreachable.ClassB;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        ClassA ca = new ClassA();
        ClassB cb = new ClassB();

        int x = 32;
        System.out.println("Hello world "+x);
    }
}
