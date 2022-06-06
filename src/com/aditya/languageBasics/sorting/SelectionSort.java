package com.aditya.languageBasics.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int getMax(int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i <= end; i++)
            if (arr[max] < arr[i])
                max = i;
        return max;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 3, 91, 99, 100, 0, 3, 2, 1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
