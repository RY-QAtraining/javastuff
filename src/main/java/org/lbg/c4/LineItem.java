package org.lbg.c4;

public class LineItem
{
    final private int lineNo;
    final private String lineValue;
    public LineItem(int lineNo, String value){
        this.lineNo = lineNo;
        lineValue = value;
    }

    public int getLineNo() {
        return lineNo;
    }


    public String getLineValue() {
        return lineValue;
    }

    public String toString(){
        return "Line "+ lineNo + " value: "+ lineValue;
    }

}

