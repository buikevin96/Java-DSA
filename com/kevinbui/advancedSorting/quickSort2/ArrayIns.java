package com.kevinbui.advancedSorting.quickSort2;

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
        int size = right - left + 1;
        if (size <=3){              // manual sort if small
            manualSort(left, right);
        } else {                    // quicksort if large
            long median = medianof3(left, right);
            int partition = partitionIt(left, right, median);    // partition range
            recQuickSort(left, partition-1);    // sort left side
            recQuickSort(partition + 1, right);     // sort right side
        }
    }

    public long medianof3(int left, int right){
        int center = (left+right)/2;

        // order left and center
        if(theArray[left] > theArray[center]){
            swap(left, center);
        }

        // order left and right
        if(theArray[left] > theArray[right]){
            swap(left, right);
        }

        // order center and right
        if(theArray[center] > theArray[right]){
            swap(center, right);
        }

        swap(center, right-1);      // put pivot on right
        return theArray[right - 1]; // return median value
    }

    public int partitionIt(int left, int right, long pivot){
        int leftPtr = left;     // right of first elem
        int rightPtr = right -1 ;   // left of pivot

        while(true){        // find bigger item
            while(theArray[++leftPtr] < pivot);
                            // find smaller item
            while(theArray[--rightPtr] > pivot);
            if(leftPtr >= rightPtr){    // if pointers cross,
                break;                  // partition done
            } else {                    // not crossed, so
                swap(leftPtr, rightPtr);// swap elements
            }
        }
        swap(leftPtr, right -1);           // restore pivot
        return leftPtr;                   // return partition
    }

    public void manualSort(int left, int right){
        int size = right - left + 1;
        if (size <= 1){
            return;         // no sort necessary
        }
        if (size == 2){
            // 2-sort left and right
            if(theArray[left] > theArray[right]){
                swap(left, right);
            }
            return;
        } else {        // size is 3
            // 3-sort left, center, and right
           if(theArray[left] > theArray[right - 1]){
               swap(left, right - 1);   // left, center
           }
           if(theArray[left] > theArray[right]){
               swap(left, right);       // left, right
           }
           if(theArray[right - 1] > theArray[right]){
               swap(right -1, right);   // center, right
           }
        }
    }

    // swap two elements
    public void swap(int dex1, int dex2){
        long temp;
        temp = theArray[dex1];          // A into temp
        theArray[dex1] = theArray[dex2];// B into A
        theArray[dex2] = temp;          // temp into B
    }
}
