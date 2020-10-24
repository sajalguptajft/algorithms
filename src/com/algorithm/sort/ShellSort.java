package com.algorithm.sort;

import static com.algorithm.ArrayConstants.UNSORTED_INT_ARRAY;
import static com.algorithm.ArrayConstants.printArray;

public class ShellSort {

    // time complexity = N(2)
    public static void main (String[] args) {

        final int[] arr = UNSORTED_INT_ARRAY;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }

        printArray(arr);
    }

}
