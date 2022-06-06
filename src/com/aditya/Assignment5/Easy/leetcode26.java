package com.aditya.Assignment5.Easy;

class Solution {
    public int removeDuplicates(int[] nums) {
        int tail = 0;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] > nums[tail])
                nums[++tail] = nums[i];
        return tail + 1;
    }
}