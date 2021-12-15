package com.aditya.Assignment5.Easy;

import java.util.Arrays;

public class leetcode1929 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] res = new int[2*len];
        for(int i = 0; i < len; i++)
        {
            res[i] = res[len+i] = nums[i];
        }
        return res;
    }
}
