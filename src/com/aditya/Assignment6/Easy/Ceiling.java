package com.aditya.Assignment6.Easy;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceiling(arr, 15));
    }

    // return number greater or equal to
    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return arr[mid];
            if (arr[mid] < target)
                start = mid + 1;
            if (arr[mid] > target)
                end = mid - 1;
        }
        return arr[start];
    }
}
