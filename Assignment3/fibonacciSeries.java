import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the term: ");
        int n = input.nextInt();
        System.out.println(n + "th term is: " + nthTerm(n));
        System.out.println("Series till " + n + " is: ");
        printSeries(n);

        input.close();
    }

    public static int nthTerm(int n) {
        int nth = 0;
        int first = 0;
        int second = 1;
        
        if(n==1) {
            nth = first;
        }
        if(n==2) {
            nth = second;
        }

        for(; n>2; n--) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }

    public static void printSeries(int n) {
        for(int i = 1; i <= n; i++)
        {
            System.out.print(nthTerm(i) + ", ");
        }
    }
}
