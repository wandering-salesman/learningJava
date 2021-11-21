package com.aditya.Assignment3.Intermediate;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Finding Perfect numbers: ");
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(checkPerfectNumber(n)) {
            System.out.print(n + " is perfect.");
        }
        else System.out.print(n + " is not perfect.");
        input.close();
    }

    public static boolean checkPerfectNumber(int n) {
        int sum = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n%i == 0) {
                sum += i;
            }
//            System.out.println(sum);
        }

        return sum == n;
    }
}
