package com.kevinbui.linkedLists.stackLinkedList;

public class LinkStack {

    private LinkList theList;

    public LinkStack(){
        theList = new LinkList();
    }

    // put item on top of stack
    public void push(long j){
        theList.insertFirst(j);
    }

    // take item from top of stack
    public long pop(){
        return theList.deleteFirst();
    }

    // true if stack is empty
    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void displayStack(){
        System.out.println("Stack (top-->bottom): ");
        theList.displayList();
    }
}
