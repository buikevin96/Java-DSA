package com.kevinbui.advancedSorting.partition;

public class ArrayPar {

    private long[] theArray;    // ref to array theArray
    private int nElems; // number of data items

    public ArrayPar(int max){
        theArray = new long[max];   // create the array
        nElems = 0; // no items yet
    }

    // Put element into array
    public void insert(long value){
        theArray[nElems] = value;   // insert it
        nElems++;   // increment size
    }

    // Return number of items
    public int size(){
        return nElems;
    }

    // Display array contents
    public void display(){
        System.out.print("A=");
        for (int j=0; j < nElems; j++){ // for each element,
            System.out.print(theArray[j] + " ");    // display it
        }
        System.out.println("");
    }

    public int partition(int left, int right, long pivot){
        int leftPtr = left - 1; // right of first elem
        int rightPtr = right + 1;   // left of pivot

        while(true){
            while(leftPtr < right && theArray[++leftPtr] < pivot);
            while(rightPtr > left && theArray[--rightPtr] > pivot);
            if(leftPtr >= rightPtr){    // if pointers cross,
                break;                  // partition done
            } else {                    // not crossed, so
                swap(leftPtr, rightPtr);// swap elements
            }
        }
        return leftPtr;                 // return partition
    }

    // swap two elements
    public void swap(int dex1, int dex2){
        long temp;
        temp = theArray[dex1];          // A into temp
        theArray[dex1] = theArray[dex2];// B into A
        theArray[dex2] = temp;          // temp into B
    }
}
