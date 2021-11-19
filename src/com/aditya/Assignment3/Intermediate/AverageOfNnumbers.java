package com.aditya.Assignment3.Intermediate;

import java.util.Scanner;

class AverageOfNnumbers {
    public static void main(String[] args) {
        System.out.println("Average of N numbers: ");
        System.out.print("Enter number of values: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Enter values: ");
        float avg = 0;
        for (int i = 0; i < n; i++)
        {
            avg += input.nextFloat();
        }
        avg /= n;
        System.out.println("Average is: " + avg);
        input.close();
    }
}