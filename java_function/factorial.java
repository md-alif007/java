import java.util.Scanner;

public class factorial {

    public static void calculateFactorail(int n) {
        int factorial = 1;

        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        }

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number to know its factorial: ");
            int n = sc.nextInt();

            calculateFactorail(n);
        }

    }
}
