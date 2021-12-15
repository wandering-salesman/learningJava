package com.aditya.Assignment5.Easy;

public class leetcode1672 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j : accounts[i]) {
                sum += j;
            }
            if(maxWealth < sum) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
