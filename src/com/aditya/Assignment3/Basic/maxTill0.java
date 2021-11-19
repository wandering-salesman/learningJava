package com.aditya.Assignment3.Basic;
import java.util.Scanner;

public class maxTill0 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inp = 1;
        System.out.println("Enter numbers, 0 will stop program:");
        int max = -1;
        do {
            System.out.print("Enter number: ");
            inp = input.nextInt();
            if(max < inp) {
                max = inp;
            }
        } while (inp != 0);
        System.out.println("Max is: " + max);
        input.close();
    }
}
