package com.aditya.Assignment5.Easy;

public class leetcode1732 {
    public static void main(String[] args) {
        int[] arr = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int altitude = 0;

        for (int j : gain) {
            altitude = j + altitude;
            if (altitude > max) {
                max = altitude;
            }
        }
        return max;
    }
}
