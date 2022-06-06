package com.aditya.Assignment6.Easy;

public class leetcode69 {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(squareRoot(x));
    }

    public static int squareRoot(int x) {
       int start = 1;
       int end = x;
       if(x == 0 | x == 1)
           return x;
       while (start <= end) {
           int mid = start+(end - start)/2;
           if(mid > x/mid)
               end = mid - 1;
           else if (mid + 1 > x/(mid + 1))
               return mid;
           else
               start = mid + 1;
       }
       return start;
    }
}
