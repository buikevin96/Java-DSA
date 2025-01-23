package com.kevinbui.stackLinkedList;

public class LinkList {

    private Link first; // ref to first link on list

    public LinkList(){
        first = null;  // no links on list yet
    }

    public boolean isEmpty() {
        return (first == null); // true if list is empty
    }

    // Insert at start of list
    public void insertFirst(long dd){
        Link newLink = new Link(dd);  // make new link

        newLink.next = first;  // newly created link points to first link (newLink --> old first)
        first = newLink; // change first so it points to newly created link (first --> newLink)
    }

    // delete first item
    public long deleteFirst(){
        Link temp = first;  // save reference to link
        first = first.next; // delete it: (first --> old next)
        return temp.dData;  // return deleted link
    }

    public void displayList(){
        Link current = first; // start at the beginning of list
        while (current != null){    // until end of list
            current.displayLink();  // print data
            current = current.next;  // move to next link
        }

        System.out.println("");
    }
}
