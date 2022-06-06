package com.aditya.Assignment5.Easy;

public class leetcode1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int digits = (int) Math.log10(i) + 1;
            if (digits % 2 == 0)
                count++;
        }

        return count;
    }
}
