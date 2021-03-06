package com.algorithm;

public abstract class ArrayConstants {

    public static final int[] UNSORTED_INT_ARRAY = new int[]{20, 35, -15, 7, 55, 1, -22};

    public static void swapArrayValues (final int[] arr, final int i, final int j) {
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray (final int[] arr) {
        for (int a : arr) System.out.println(a);
    }

}
