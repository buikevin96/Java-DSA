package com.kevinbui.advancedSorting.quickSort;

public class ArrayIns {

    private long[] theArray;    // ref to array theArray
    private int nElems; // number of data items

    public ArrayIns(int max){
        theArray = new long[max];   // create the array
        nElems = 0; // no items yet
    }

    // Put element into array
    public void insert(long value){
        theArray[nElems] = value;   // insert it
        nElems++;   // increment size
    }

    // Display array contents
    public void display(){
        System.out.print("A=");
        for (int j=0; j < nElems; j++){ // for each element,
            System.out.print(theArray[j] + " ");    // display it
        }
        System.out.println("");
    }

    public void quickSort(){
        recQuickSort(0, nElems-1);
    }

    public void recQuickSort(int left, int right){
        if (right - left <= 0){     // if size <= 1,
            return;                 // already sorted
        } else {                    // size is 2 or larger
            long pivot = theArray[right];   // rightmost item
            int partition = partitionIt(left, right, pivot);    // partition range
            recQuickSort(left, partition-1);    // sort left side
            recQuickSort(partition + 1, right);     // sort right side
        }

    }

    public int partitionIt(int left, int right, long pivot){
        int leftPtr = left - 1; // left (after ++)
        int rightPtr = right;   // right-1 (after --)

        while(true){        // find bigger item
            while(theArray[++leftPtr] < pivot);
                            // find smaller item
            while(rightPtr > 0 && theArray[--rightPtr] > pivot);
            if(leftPtr >= rightPtr){    // if pointers cross,
                break;                  // partition done
            } else {                    // not crossed, so
                swap(leftPtr, rightPtr);// swap elements
            }
        }
        swap(leftPtr, right);           // restore pivot
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
