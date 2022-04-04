package com.aditya.languageBasics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int k = input.nextInt();
        System.out.println("Entered value: " + k);
        input.close();
    }
}
