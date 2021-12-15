package com.aditya.Assignment5.Easy;
import java.util.ArrayList;
import java.util.List;

public class leetcode1431 {

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> res = new ArrayList<Boolean>();
        for(int i = 1; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }
        for (int candy : candies) {
            Boolean k = (candy + extraCandies) >= max;
            res.add(k);
        }
        return res;
    }
}
