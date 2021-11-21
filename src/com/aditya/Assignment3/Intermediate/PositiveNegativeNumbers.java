package com.aditya.Assignment3.Intermediate;

//        sum of negative numbers
//        sum of positive even numbers
//        the sum of positive odd numbers
//        from a list of numbers (N) entered by the user.
//        The list terminates when the user enters a zero

import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        System.out.println("Printing series: ");
        printSeries();
    }

    private static void printSeries() {
        Scanner input = new Scanner(System.in);
        int n;
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;
        int totalSum = 0;
        System.out.println("Start entering numbers: ");
        do {
            System.out.print("Enter number: ");
            n = input.nextInt();
            if(n < 0) {
                sumNegative += n;
            }
            else if (n%2==0) {
                sumPositiveEven += n;
            }
            else {
                sumPositiveOdd += n;
            }
            totalSum += n;
        }
        while (n!=0);
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
        System.out.print("Total sum: " + totalSum);
        input.close();
    }
}
