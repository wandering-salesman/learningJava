package com.aditya.Assignment6.Easy;

public class leetcode367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(15));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long squ = mid * mid;
            if (squ == num)
                return true;
            else if (squ > num)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}
