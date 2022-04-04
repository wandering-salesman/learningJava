package com.aditya.Assignment5.Easy;

import java.util.Arrays;

class leetcode1252 {
    public static void main(String[] args) {
        int[][] indices = {{1, 1}, {0, 0}};
        int m = 2;
        int n = 2;
        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        int count = 0;
        for (int[] index : indices) {
            for (int i = 0; i < m; i++)
                res[i][index[1]] += 1;

            for (int i = 0; i < n; i++)
                res[index[0]][i] += 1;
        }

        for (int[] row : res)
            for (int val : row)
                if (val % 2 == 1) count++;

        return count;
    }

}