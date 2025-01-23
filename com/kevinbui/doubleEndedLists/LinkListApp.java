package com.kevinbui.doubleEndedLists;

public class LinkListApp {
        public static void main(String[] args) {
            FirstLastList theList = new FirstLastList();  // make new list

            theList.insertFirst(22);
            theList.insertFirst(44);
            theList.insertFirst(66);


            theList.insertLast(11);
            theList.insertLast(33);
            theList.insertLast(55);

            theList.displayList();

            theList.deleteFirst();
            theList.deleteFirst();

            theList.displayList();
        }
}
