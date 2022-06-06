package com.aditya.Assignment5.Easy;

import java.util.Arrays;

public class leetcode867 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposed = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
        System.out.println("Transposed: ");
        for (int[] row : transpose(mat))
            System.out.println(Arrays.toString(row));
    }

    public static int[][] transpose(int[][] matrix) {
        if (matrix.length == matrix[0].length) {
            int col = 0; // need to take this as the initializer for j, because otherwise it gets initialized to j = 0, everytime the loop starts
            for (int i = 0; i < matrix.length; i++) {
                for (int j = col; j < matrix.length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
                col++;
            }
            return matrix;
        }
        int[][] res = new int[matrix[0].length][matrix.length];
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                res[j][i] = matrix[i][j];
            col++;
        }
        return res;
    }
}
