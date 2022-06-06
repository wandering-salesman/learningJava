package com.aditya.languageBasics.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i - 1; j++) {
                if(arr[i] <= arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr =  {1, 5, 7, 9, 2, 4, 3, 7};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
