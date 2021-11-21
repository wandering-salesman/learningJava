package com.aditya.Assignment3.Intermediate;
import java.util.Scanner;

public class LCMofNumbers {
    public static void main(String[] args) {
        System.out.println("LCM of numbers: ");
        System.out.print("Enter numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int LCM = num1*num2/ HCFofNumbers.HCF(num1, num2);
        System.out.println("LCM is: " + LCM);
        input.close();
    }
}
