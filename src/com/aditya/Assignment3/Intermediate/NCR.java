package com.aditya.Assignment3.Intermediate;

import java.util.Scanner;

class NCR {
    /*
        NCR = n!/(r!*(n-r)!)
        can be
        simplified as n*(n-1)* ... *(n-r-1)/r!;
        or numerator/(n-r)!
        depending on the value of r and (n-r)
    */

    public static void main(String[] args) {
        System.out.println("nCr calculator: ");
        System.out.print("Enter n and r: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int numerator = 1;
        int denominator = 1;
        int result;

        if((n-r) >= r)
        {
            for(int i = n; i >= n-r; i--) {
                numerator *= i;
            }
            for(int i = 1; i < r; i++)
            {
                denominator *= i;
            }
        }
        else
        {
            for(int i = n; i > r; i--) {
                numerator *= i;
            }
            for(int i = 1; i < n-r; i++)
            {
                denominator *= i;
            }
        }
        result = numerator/denominator;
        System.out.println("Answer: " + result);
    }
}