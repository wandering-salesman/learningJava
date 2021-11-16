import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();

        for(int i = 1; i <= n/2; i++) {
            if(n%i == 0) {
                System.out.print(i + ", ");
            }
        }
        input.close();
    }
}