package com.kevinbui.linkedLists.queueLinkedList;

public class Link {

    public long dData; // data item
    public Link next; // next link in list

    public Link(long d){
        dData = d;
    }

    public void displayLink() {
        System.out.println(dData + " ");
    }
}
