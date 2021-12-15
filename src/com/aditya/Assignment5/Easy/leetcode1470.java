package com.aditya.Assignment5.Easy;

import java.util.Arrays;

public class leetcode1470 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7 };
        System.out.println(Arrays.toString(shuffle(arr, 3)));
        arr = new int[]{1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr, 4)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int [2*n];
        int j = 0;
        int k = 0;
        for(int i = 0; i < 2*n; i++) {
            if(i%2 == 0) {
                res[i] = nums[j];
                j++;
            }
            else {
                res[i] = nums[n+k];
                k++;
            }
        }
        return res;
    }
}
