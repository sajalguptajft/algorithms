package com.algorithm.sort;

import static com.algorithm.ArrayConstants.UNSORTED_INT_ARRAY;
import static com.algorithm.ArrayConstants.printArray;

public class InsertionSort {

    // time complexity = N(2)
    public static void main (String[] args) {

        final int[] arr = UNSORTED_INT_ARRAY;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }

        printArray(arr);

    }

}
