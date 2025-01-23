package com.kevinbui.linkedLists.doublyLinkedList;

public class DoublyLinkedList {

    private Link first;
    private Link last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    //Make new link (add to head)
    public void insertFirst(long dd){
        Link newLink = new Link(dd);

        if(isEmpty()){
            last = newLink; // update both tail and head to new node
        } else {
            first.previous = newLink; // set the prev of the current head to the new node
        }
        newLink.next = first; // set the next of the new node to the address of the current head
        first = newLink; // update head with new node
    }

    // Insert at end of list (add to tail)
    public void insertLast(long dd){
        Link newLink = new Link(dd);    // make new link

        if(isEmpty()){
            first = newLink; // update both head and tail to point to new node
        } else {
            last.next = newLink;    //set the next of the current tail to the new node
            newLink.previous = last;    //set the prev of the new node to point to current tail
        }
        last = newLink; // set the tail to point to the new node
    }

    // Delete first link (assume non-empty list)
    public Link deleteFirst(){
        Link temp = first;
        if (first.next == null){    // if only one item
            last = null;    // null <-- last
        } else {
            first.next.previous = null; // null <== old next
        }
        first = first.next; // set the head to point to next of current head
        return temp;
    }

    // delete last link (assume non-empty list)
    public Link deleteLast(){
        Link temp = last;
        if (first.next == null){    // if only one item
            first = null;   // first --> null
        } else {
            last.previous.next = null;  // old previous --> null
        }
        last  = last.previous;  // old previous <-- last
        return temp;
    }

    public boolean insertAfter(long key, long dd){
        Link current = first;   // start at beginning
        while(current.dData != key){    //until match is found
            current = current.next; // move to next link
            if (current == null){
                return false;       // didnt find it
            }
        }

        Link newLink = new Link(dd);    // make new link

        if(current == last){
            newLink.next = null;    // newLink --> null
            last = newLink; // newLink <-- last
        } else {    // not last link
            newLink.next = current.next;    // newLink --> old next
            current.next.previous = newLink;
        }
        newLink.previous = current; // old current <-- newLink
        current.next = newLink; // old current --> newLink
        return true;
    }

    // Delete item w/ given key (assume non-empty list)
    public Link deleteKey(long key){
        Link current = first;   // start at beginning
        while(current.dData != key){    // until match is found
            current = current.next; // move to next link
            if(current == null) {
                return null;       // didnt find it
            }
        }
        if (current == first){     // found it; first item?
            first = current.next;   // first --> old next
        } else {    // not first
            current.previous.next = current.next;   // old previous --> old next
        }

        if(current == last){    // last item?
            last = current.previous; // old previous <-- last
        } else {
            current.next.previous = current.previous;   // old previous <-- old next
        }
        return current;
    }

    public void displayForward(){
        System.out.print("List (first-->last): ");
        Link current = first;   // start at the beginning
        while(current != null){ // until end of list
            current.displayLink();  // display data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

    public void displayBackward(){
        System.out.print("List (last-->first): ");
        Link current = last;   // start at the end
        while(current != null){ // until start of ist
            current.displayLink();  // display data
            current = current.previous; // move to previous link
        }
        System.out.println("");
    }
}
