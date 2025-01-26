/*
    Demonstrates shell sort
 */

package com.kevinbui.advancedSorting.shellSort;

public class ArraySh {

    private long[] theArray;    // ref to array theArray
    private int nElems; // number of data items

    public ArraySh(int max){
        theArray[nElems] = max;   // create the array
        nElems = 0; // no items yet
    }

    // Put element into array
    public void insert(long value){
        theArray[nElems] = value;   // insert it
        nElems++;   // increment size
    }

    // Displays array contents
    public void display(){
        System.out.print("A=");
        for (int j = 0; j < nElems; j++){   // for each element
            System.out.print(theArray[j] + " ");
        }
        System.out.println("");
    }

    public void shellSort(){
        int inner;
        int outer;
        long temp;

        int h = 1;  // find initial value of h
        while (h <= nElems/3){
            h = h*3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while(h>0){ // decreasing h, until h=1
            for(outer = h; outer<nElems; outer++){
                temp = theArray[outer];
                inner = outer;

                // one subpass (eg 0, 4, 8)
                while(inner > h - 1 && theArray[inner-h] >= temp){
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
