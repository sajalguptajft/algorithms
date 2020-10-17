package com.algorithm.sort;

import static com.algorithm.ArrayConstants.*;

public class SelectionSort {

    // time complexity = N(2)
    public static void main (String[] args) {

        final int[] arr = UNSORTED_INT_ARRAY;

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) largest = i;
            }

            swapArrayValues(arr, largest, lastUnsortedIndex);

        }

        printArray(arr);

    }

}
