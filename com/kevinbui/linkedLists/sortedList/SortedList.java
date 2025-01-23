package com.kevinbui.linkedLists.sortedList;

public class SortedList {

    private Link first; // first item on list

    public SortedList(){
        first = null;
    }

    // true if no links
    public boolean isEmpty(){
        return (first == null);
    }

    // put item on top of stack
    public void insert(long key){   // insert, in order
        Link newLink = new Link(key);   // make new link
        Link previous = null;   // start at first
        Link current = first;

        // until end of list, or key > current
        while(current != null && key > current.dData){
            previous = current;
            current = current.next; // go to next item
        }

        if (previous == null){  // at beginning of list
            first = newLink;    // first --> newLink
        } else {    // not at beginning
            previous.next = newLink;    // old prev -> new link
        }
        newLink.next = current;
    }

    // return and delete first link
    public Link remove(){
        Link temp = first;  // save first
        first = first.next; // delete first
        return temp;    // return value
    }

    public void displayList() {
        System.out.println("List (first-->last): ");
        Link current = first;   // start at beginning of list
        while (current != null) { // until end of list
            current.displayLink();  // print data
            current = current.next; // move to next link
        }

        System.out.println("");
    }
}
