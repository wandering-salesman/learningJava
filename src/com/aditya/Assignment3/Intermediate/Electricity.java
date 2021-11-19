package com.aditya.Assignment3.Intermediate;

import java.util.Scanner;

class Electricity {
    public static void main(String[] args) {
        System.out.println("Electricity bill calculator: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter watts: ");
        int watts = input.nextInt();
        System.out.print("Enter days: ");
        int days = input.nextInt();
        System.out.print("Enter hours: ");
        int hours = input.nextInt();
        System.out.print("Enter cost kWh: ");
        int cost = input.nextInt();

        int usage = watts*days*hours*cost/1000;

        System.out.println("Total usage cost is: " + usage);
        input.close();
    }
}