package com.kevinbui.linkedLists.listInsertionSort;

public class ListInsertionSortApp {
        public static void main(String[] args) {
            int size = 10;

            Link[] linkArray = new Link[size];  // Create array of links

            for (int j=0; j<size; j++){ // fill array with links
                int n = (int)(java.lang.Math.random()*99);  // random number
                Link newLink = new Link(n); //make link
                linkArray[j] = newLink; // put in array
            }

            // Display Array Contents
            System.out.println("Unsorted Array: ");
            for (int j=0; j < size; j++){
                System.out.println(linkArray[j].dData + " ");
            }
            System.out.println("");

            // Create new list initialized with array
            SortedList theSortedList = new SortedList(linkArray);

            for(int j = 0; j<size; j++){    // links from list to array
                linkArray[j] = theSortedList.remove();
            }

            System.out.println("Sorted Array: ");
            for(int j=0; j<size; j++){
                System.out.println(linkArray[j].dData + " ");
            }
            System.out.println("");
        }
}
