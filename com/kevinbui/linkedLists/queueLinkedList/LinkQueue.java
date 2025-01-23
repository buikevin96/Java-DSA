package com.kevinbui.linkedLists.queueLinkedList;

public class LinkQueue {

    private FirstLastList theList;

    public LinkQueue(){
        theList = new FirstLastList();
    }

    // true if queue is empty
    public boolean isEmpty(){
        return theList.isEmpty();
    }

    // put item on top of stack
    public void insert(long j){
        theList.insertLast(j);
    }

    // take item from top of stack
    public long remove(){
        return theList.deleteFirst();
    }

    public void displayQueue(){
        System.out.println("Queue (front-->rear): ");
        theList.displayList();
    }
}
