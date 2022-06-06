package com.aditya.Assignment6.Easy;

public class leetcode441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }

    public static int arrangeCoins(int n) {
        long start = 2;
        long end = n/2;
        if(n <= 1)
            return  n;
        if(n == 2)
            return 1;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coinsFilled = mid * (mid + 1) / 2;
            if (coinsFilled == n)
                return (int) mid;
            else if (coinsFilled < n)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int)start;
    }
}
