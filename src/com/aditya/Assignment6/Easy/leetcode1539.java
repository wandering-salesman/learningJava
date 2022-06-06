package com.aditya.Assignment6.Easy;

public class leetcode1539 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length;
        int res = 0;
        if (arr[start] - arr[end] == arr.length - 1)
            return arr[arr.length - 1] + k + 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - 1 - mid < k)
                start = mid + 1;
            else
                end = mid;
        }
        return start + k;
    }
}
