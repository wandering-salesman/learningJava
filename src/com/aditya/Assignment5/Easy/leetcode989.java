package com.aditya.Assignment5.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode989 {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<Integer>();
        int temp = k;
        int digit;
        int count = 0;
        while(temp > 0) {
            digit = temp % 10;
            int x = num[count] + digit;
            if(x >= 10) {
                res.set(count, x%10);
                res.set(count+1, 1);
            }
            else {
                res.set(count, x);
            }
            temp = temp/10;
        }
        Collections.reverse(res);
        return res;
    }
}
