package com.kevinbui.doubleEndedLists;

public class FirstLastList {

    private Link first; // ref to first link on list
    private Link last; // ref to last lin

    public FirstLastList(){
        first = null;  // no links on list yet
        last = null;
    }

    public boolean isEmpty() {
        return (first == null); // true if list is empty
    }

    // Insert at start of list
    public void insertFirst(long dd){
        Link newLink = new Link(dd);  // make new link

        if(isEmpty()){  // if empty list
            last = newLink; //newLink <-- last
        }
        newLink.next = first;  // newly created link points to first link (newLink --> old first)
        first = newLink; // change first so it points to newly created link (first --> newLink)
    }

    public void insertLast(long dd){
        Link newLink = new Link(dd);  // make new link

        if(isEmpty()){  // if empty list
            first = newLink; //newLink --> last
        } else {
            last.next = newLink;    // last.next points to new link (old last --> newLink)
        }
        last = newLink; // last points to new Link (newLink <-- last)
    }

    // delete first link
    public long deleteFirst(){
        long temp = first.dData;
        if(first.next == null){ // if only one item
            last = null;    // null <-- last
        }
        first = first.next; // first --> old next
        return temp;
    }

    public void displayList(){
        System.out.print("List (first-->last): ");
        Link current = first; // start at the beginning of list
        while (current != null){    // until end of list
            current.displayLink();  // print data
            current = current.next;  // move to next link
        }

        System.out.println("");
    }
}
