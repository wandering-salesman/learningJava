import java.util.Scanner;

/**
 * Assignment2
 */

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Program starts here.");
        Scanner input = new Scanner(System.in);
        char k = 'y';
        int choice;
        do {
            System.out.println("1. OddEven.");
            System.out.println("2. Greeting");
            System.out.println("3. Simple Interest");
            System.out.println("4. Calculator");
            System.out.println("5. Max of two");
            System.out.println("6. Rupee to USD");
            System.out.println("7. Fibonacci nth term");
            System.out.println("8. Palindrome check");
            System.out.println("9. Armstrong in range");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            System.out.println("\n");
            switch (choice) {
            case 1:
                System.out.println("\nOdd and even numbers: ");
                oddOrEven();
                break;

            case 2:
                System.out.println("Greeting: ");
                System.out.print("Enter your name: ");
                input.next();
                break;

            case 3:
                System.err.println("Simple interest: ");
                simpleInterest();
                break;

            case 4:
                System.out.println("Calculator: ");
                calculator();
                break;

            case 5:
                System.out.println("Max of two numbers: ");
                max();
                break;

            case 6:
                System.out.println("Rupee to USD: ");
                rupeeToUSD();
                break;

            case 7:
                System.out.println("Fibonacci series: ");
                fibonacciSeries();
                break;

            case 8:
                System.out.println("Palindrome: ");
                palindrome();
                break;

            case 9:
                System.out.println("Armstrong number: ");
                armstrongNumber();
                break;

            default:
                System.out.println("Invalid Input");
                break;
            }

            System.out.print("\n\nContinue?: ");
            k = input.next().charAt(0);
            System.out.println("\n");
        } while (k == 'y' || k == 'Y');
    }

    static void oddOrEven() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd");
        }
        return;
    }

    static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    static void simpleInterest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal, time and rate: ");
        float p = input.nextInt();
        float t = input.nextInt();
        float r = input.nextInt();
        float si = p * r * t / 100;
        System.out.println("Simple interest is: " + si);
    }

    static void calculator() {
        float num1, num2;
        char operator;
        Scanner input = new Scanner(System.in);
        float result;
        char k = 'y';
        while (k == 'Y' || k == 'y') {
            result = 0;
            System.out.print("Enter numbers followed by operator");
            num1 = input.nextFloat();
            num2 = input.nextFloat();
            operator = input.next().charAt(0);
            if (operator == '+') {
                result = num1 + num2;
            }
            if (operator == '-') {
                result = num1 - num2;
            }
            if (operator == '*') {
                result = num1 * num2;
            }
            if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Invalid arguments");
                }
            }

            System.out.println("The result is: " + result);
            System.out.print("\nPress y to continue, any other key to exit.");
            k = input.next().charAt(0);
        }
    }

    static void max() {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num1 == num2) {
            System.out.println("Both are equal");
        } else {
            System.out.println(num2 + " is greater.");
        }
    }

    static void rupeeToUSD() {
        int rupee;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rupee: ");
        rupee = input.nextInt();
        float usd = rupee / 72.0f;
        System.out.println(rupee + " in USD are: " + usd);
    }

    static void fibonacciSeries() {
        int n;
        int first = 0;
        int second = 1;
        int term = 0;
        System.out.print("Enter term number: ");
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        if (n == 1) {
            term = 0;
        }
        if (n == 2) {
            term = 1;
        }

        for (int i = 2; i < n; i++) {
            term = second;
            second = first + second;
            first = term;
            term = second;
        }
        System.out.println("Term no " + n + ": " + term);
    }

    static void palindrome() {
        String inp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        inp = input.next();
        boolean res = true;
        for (int i = 0; i < inp.length() - 1; i++) {
            if (inp.charAt(i) != inp.charAt(inp.length() - 1 - i)) {
                res = false;
            }
        }
        if (res) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }

    static void armstrongNumber() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int temp;
        int copy;

        System.out.print("Enter the numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for (; num1 <= num2; num1++) {
            copy = num1;
            sum = 0;
            while (copy > 0) {
                temp = copy % 10;
                copy /= 10;
                sum += temp * temp * temp;
                // System.out.println(sum);
            }

            if (num1 == sum) {
                System.out.print(num1 + ", ");
            }
        }
    }

}
