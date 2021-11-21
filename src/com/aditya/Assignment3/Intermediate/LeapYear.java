package com.aditya.Assignment3.Intermediate;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Finding leap year: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        if(isLeap(year)) {
            System.out.print(year + " is leap year.");
        }
        else System.out.print(year + " is not leap year.");
        input.close();
     }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year%100 != 0 || year%400 == 0;
    }
}
