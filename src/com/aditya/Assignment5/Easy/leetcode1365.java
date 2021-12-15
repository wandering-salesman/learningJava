package com.aditya.Assignment5.Easy;

import java.util.Arrays;

public class leetcode1365 {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            for(int j = 0; j < nums.length; j++) {
                if(curr > nums[j] && j != i)  {
                    res[i]++;
                }
            }
        }
        return res;
    }
}
