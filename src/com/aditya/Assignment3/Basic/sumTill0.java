package com.aditya.Assignment3.Basic;
import java.util.Scanner;

public class sumTill0 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inp = 1;
        System.out.println("Enter numbers, 0 will stop program:");
        int sum = 0;
        do {
            System.out.print("Enter number: ");
            inp = input.nextInt();
            sum += inp;
        } while (inp != 0);
        System.out.println("Sum is: " + sum);
        input.close();
    }
}
