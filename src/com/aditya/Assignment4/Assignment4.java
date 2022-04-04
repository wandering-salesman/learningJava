package com.aditya.Assignment4;

import java.util.Scanner;
// import java.util.Vector;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Max of them is: " + maxOfThree(a, b, c));
        System.out.println("\n");

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println(n + " is " + evenOdd(n));
        System.out.println("\n");

        System.out.print("Vote eligibility: ");
        int age = input.nextInt();
        System.out.println("Can vote? " + voteEligible(age));
        System.out.println("\n");

        System.out.print("Enter two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        sumOfTwoNum(a,b);
        System.out.println("\n");

        System.out.print("Enter two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        productOfTwoNum(a,b);
        System.out.println("\n");


        System.out.print("Enter radius: ");
        float r = input.nextFloat();
        circumferenceOfCircle(r);
        areaOfCircle(r);
        System.out.println("\n");

        System.out.print("Enter number: ");
        n = input.nextInt();
        System.out.print("Number is prime: " + primeOrNot(n));
        System.out.println("\n");

        System.out.print("Enter marks: ");
        int marks = input.nextInt();
        System.out.print("Grade is: ");
        grade(marks);
        System.out.println("\n");

        System.out.print("Enter number: ");
        n = input.nextInt();
        factorial(n);
        System.out.println("\n");

        System.out.print("Enter a number: ");
        n = input.nextInt();
        palindromeNumber(n);
        System.out.println("\n");

        System.out.println("3, 4 and 5 is Pythagorean triplet: ");
        pythagoreanTriplet(3,4,5);
        System.out.println("\n");

        System.out.println("Prime numbers in range 8 to 55 are: ");
        primeNumbersInRange(8, 55);
        System.out.println("\n");

        System.out.println("Sum of first 50 natural numbers is: ");
        sumOfNaturalNumbers(50);
        System.out.println("Sum of first 10 natural numbers is: ");
        sumOfNaturalNumbers(10);

        System.out.println("\n\n\nEnd");
        input.close();
    }

    //    Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    public static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= a && b >= c) {
            return b;
        }
        return c;
    }

    //    Define a program to find out whether a given number is even or odd.
    public static String evenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    //    A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    public static boolean voteEligible(int age) {
        return age >= 18;
    }

    //    Write a program to print the sum of two numbers entered by user by defining your own method
    public static void sumOfTwoNum(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }

    //    Define a method that returns the product of two numbers entered by user
    public static void productOfTwoNum(int a, int b) {
        System.out.println("Product is: " + a*b);
    }

    //    Write a program to print the circumference and area of a circle of radius entered by user by defining your own method
    public static void circumferenceOfCircle(float r) {
        System.out.println("Circumference: " + ((float) 2 * 3.14 * r));
    }

    public static void areaOfCircle(float r) {
        System.out.println("Area: " + ((float) 3.14 * r * r));
    }

    //    Define a method to find out if a number is prime or not
    public static boolean primeOrNot(int n) {
        boolean res = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                res = false;
            }
        }
        return res;
    }

    //    Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
    public static void grade(int marks) {
        if (91 <= marks && marks <= 100) {
            System.out.println("AA");
        } else if (81 <= marks && marks <= 90) {
            System.out.println("AB");
        } else if (71 <= marks && marks <= 80) {
            System.out.println("BB");
        } else if (61 <= marks && marks <= 70) {
            System.out.println("BC");
        } else if (51 <= marks && marks <= 60) {
            System.out.println("CD");
        } else if (41 <= marks && marks <= 50) {
            System.out.println("DD");
        } else if (0 <= marks && marks <= 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Marks");
        }
    }

    //    Write a program to print the factorial of a number by defining a method named 'Factorial'.
    public static void factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        System.out.println("Factorial is: " + fact);
    }

    //    Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void palindromeNumber(int n) {
        int copy = n;
        int reverse = 0;
        while (copy > 0) {
            reverse *= 10;
            reverse += copy % 10;
            copy = copy / 10;
        }
        if (reverse == n) {
            System.out.println(n + " is palindrome.");
        } else {
            System.out.println(n + " is not palindrome.");
        }
    }

    //    Write a function to check if a given triplet is a Pythagorean triplet or not
    public static void pythagoreanTriplet(int a, int b, int c) {
        int hypotenuse = maxOfThree(a, b, c);
        if (hypotenuse * hypotenuse == a * a + b * b) {
            System.out.println("It's a pythagorean triplet");
        } else {
            System.out.println("Not pythagorean triplet");
        }
    }

    //    Write a function that returns all prime numbers between two given numbers.
//    public static Vector<Integer> primeNumbersInRange(int a, int b) {
//        Vector<Integer> primes;
//        for (int i = 0; a <= b; a++)
//        {
//            if(primeOrNot(a)) {
//                primes.add(a);
//            }
//        }
//        return primes;
//
//    }
    public static void primeNumbersInRange(int a, int b)
    {
        for (int i = a; i <= b; i++)
        {
            if(primeOrNot(i))
            {
                System.out.print(i + " ");
            }
        }
    }

    //    Write a function that returns the sum of first n natural numbers
    public static void sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum+= i;
        }
    /*
        or
        sum = n*(n+1)/2;
    */
        System.out.println("Sum of " + n + " numbers is: " + sum);
    }
}