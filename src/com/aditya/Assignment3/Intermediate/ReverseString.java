package com.aditya.Assignment3.Intermediate;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Reverse String");
        System.out.print("Enter string: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char ch[] = str.toCharArray();
        String res = "";
        int n = str.length();
        for(int i = 0; i < n; i++) {
            res += ch[n - i - 1];
        }
        System.out.println("Reversed: " + res);
     }
}
