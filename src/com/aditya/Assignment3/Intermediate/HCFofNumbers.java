package com.aditya.Assignment3.Intermediate;

import java.util.Scanner;

public class HCFofNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HCF of numbers: ");
        System.out.print("Enter numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("GCD is: " + HCF(num1, num2));
        input.close();
    }
    public static int HCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        else return HCF (num2, num1%num2);
    }
}
