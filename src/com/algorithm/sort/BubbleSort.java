package com.algorithm.sort;

import static com.algorithm.ArrayConstants.*;

public class BubbleSort {

    // time complexity = N(2)
    public static void main (String[] args) {

        final int[] arr = UNSORTED_INT_ARRAY;

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) swapArrayValues(arr, i, i + 1);
            }
        }

        printArray(arr);

    }

}
