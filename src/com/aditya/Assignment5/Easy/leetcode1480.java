package com.aditya.Assignment5.Easy;

import java.util.Arrays;

public class leetcode1480 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int run = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = run + nums[i];
            run = nums[i];
        }
        return nums;
    }
}
