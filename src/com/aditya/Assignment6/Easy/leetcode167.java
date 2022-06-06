package com.aditya.Assignment6.Easy;

import java.util.Arrays;

public class leetcode167 {
    public static void main(String[] args) {
        int[] numbers = {3,24,50,79,88,150,345};
        int target = 200;
        int[] res = twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(numbers[start] + numbers[end] != target) {
            if(numbers[start] + numbers[end] > target)
                end--;
            else
                start++;
        }
        return new int[] {start+1, end+1};
    }
}
