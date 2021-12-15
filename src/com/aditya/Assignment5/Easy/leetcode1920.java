package com.aditya.Assignment5.Easy;

import java.util.Arrays;

public class leetcode1920 {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        System.out.print(Arrays.toString(buildArray(arr)));
    }
    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
}
