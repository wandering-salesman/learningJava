package com.aditya.Assignment3.Intermediate;

import java.util.Scanner;

class NPR {
    /*
        NPR = n!/(n-r)!
        can be
        simplified as n*(n-1)* ... *(n-r-1)
    */

    public static void main(String[] args) {
        System.out.println("nPr calculator: ");
        System.out.print("Enter n and r: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int result = 1;

            for(int i = n; i > n-r; i--) {
                result *= i;
            }
        System.out.println("Answer: " + result);
    }
}