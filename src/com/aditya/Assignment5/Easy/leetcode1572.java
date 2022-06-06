package com.aditya.Assignment5.Easy;

public class leetcode1572 {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        if (mat.length == 1)
            return mat[0][0];
        for (int i = 0, j = 0; i < mat.length && j < mat.length; i++, j++)
            sum += mat[i][j];

        for (int i = 0, j = mat.length - 1; i < mat.length && j >= 0; i++, j--)
            sum += mat[i][j];

        if (mat.length % 2 == 1) sum -= mat[mat.length / 2][mat.length / 2];

        return sum;
    }
}
