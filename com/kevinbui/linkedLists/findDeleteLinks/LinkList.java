package com.kevinbui.linkedLists.findDeleteLinks;

public class LinkList {

    private Link first; // ref to first link on list

    public LinkList(){
        first = null;  // ref to first link on list
    }

    public boolean isEmpty() {
        return (first == null); // true if list is empty
    }

    // Insert at start of list
    public void insertFirst(int id, double dd){
        Link newLink = new Link(id, dd);  // make new link
        newLink.next = first;  // newly created link points to first link (newLink --> old first)
        first = newLink; // change first so it points to newly created link (first --> newLink)
    }

    // Find link with given key (assumes non-empty list)
    public Link find(int key){
        Link current = first;   // start at 'first
        while(current.iData != key){    // while no match
            if(current.next == null){   // if end of list
                return null;    // didn't find it
            } else {    // not end of list
                current = current.next; // go to next link
            }
        }
        return current;     // found it
    }

    // delete link with given key
    public Link delete(int key){
        Link current = first;   // search for link
        Link previous = first;
        while(current.iData != key){
            if(current.next == null){
                return null;    // didn't find it
            } else{
                previous = current;     // go to next link
                current = current.next;
            }
        }   // found it
        if(current == first){   // if first link,
            first = first.next; // change first
        } else{     // otherwise,
            previous.next = current.next;   // bypass it
        }
        return current;
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
