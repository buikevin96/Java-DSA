package com.kevinbui.linkedLists.doublyLinkedList;

public class Link {

    public long dData; // data item
    public Link next; // next link in list
    public Link previous; // previous link in list

    public Link(long dd){ // initialize data
        dData = dd;
    }

    public void displayLink() {
        System.out.println(dData + " ");
    }
}
