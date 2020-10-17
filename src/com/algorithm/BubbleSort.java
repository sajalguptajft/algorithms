package com.algorithm;

public class BubbleSort {

    // time complexity = N(2)
    public static void main (String[] args) {

        int[] arr = new int[]{93, 51, 2, 63, 82, 13, 36};

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) swap(arr, i, i + 1);
            }
        }

        for (int a : arr) System.out.println(a);

    }

    private static void swap (int[] arr, int i, int j) {
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
