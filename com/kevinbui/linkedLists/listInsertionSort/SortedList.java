package com.kevinbui.linkedLists.listInsertionSort;

public class SortedList {

    private Link first; // first item on list

    public SortedList(){
        first = null;
    }

    public SortedList(Link[] linkArr){  // constructor (array as argument)
        first = null;
        for(int j=0; j<linkArr.length; j++){
            insert(linkArr[j]);
        }
    }

    // true if no links
    public boolean isEmpty(){
        return (first == null);
    }

    // put item on top of stack
    public void insert(Link k){   // insert, in order
        Link previous = null;   // start at first
        Link current = first;

        // until end of list, or key > current
        while(current != null && k.dData > current.dData){
            previous = current;
            current = current.next; // go to next item
        }

        if (previous == null){  // at beginning of list
            first = k;    // first --> newLink
        } else {    // not at beginning
            previous.next = k;    // old prev -> new link
        }
        k.next = current;
    }

    // return and delete first link
    public Link remove(){
        Link temp = first;  // save first
        first = first.next; // delete first
        return temp;    // return value
    }

//    public void displayList(){
//        System.out.println("List (first-->last): ");
//        Link current = first;   // start at beginning of list
//        while(current != null){ // until end of list
//            current.displayLink();  // print data
//            current = current.next; // move to next link
//        }
//
//        System.out.println("");
//    }
}
