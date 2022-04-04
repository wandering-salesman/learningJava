package com.aditya.languageBasics;

public class Shadowing {
    static int a = 100;

    public static void main(String[] args) {
        System.out.println(a);
        {
            int a = 5;
            System.out.println(a);
        }
        System.out.println(a);
    }
}
