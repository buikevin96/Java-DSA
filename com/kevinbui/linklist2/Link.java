package com.kevinbui.linklist2;

public class Link {

    public int iData; // data item (key)
    public double dData; // data item
    public Link next; // next link in list

    public Link(int id, double dd){
        iData = id; // initialize data
        dData = dd;
    }

    public void displayLink() {
        System.out.println("{" + iData + ", " + dData + "} ");
    }
}
