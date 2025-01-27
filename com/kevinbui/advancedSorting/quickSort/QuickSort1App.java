package com.kevinbui.advancedSorting.quickSort;

public class QuickSort1App {

    public static void main(String[] args) {
        int maxSize = 16;       // array size
        ArrayIns arr;           // reference to array
        arr = new ArrayIns(maxSize); // create the array

        for(int j = 0; j < maxSize; j++){   // fill array with random numbers
            long n = (int)(Math.random() * 99);
            arr.insert(n);
        }
        arr.display();          // display unsorted array
        arr.quickSort();        // quicksort them
        arr.display();          // display them again
    }
}
