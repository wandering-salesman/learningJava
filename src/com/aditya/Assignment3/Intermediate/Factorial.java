package com.aditya.Assignment3.Intermediate;

import java.util.Scanner;
public class Factorial  {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Factorial program: ");
        System.out.print("Enter number: ");
        num = input.nextInt();
        int factorial = 1;
        for(int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        System.out.println("Factorial is: " + factorial);
        input.close();
    }
}