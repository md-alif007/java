// *
// **
// ***
// ****
// *****

import java.util.Scanner;

public class rightAngledStar {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many rows do u want : ");
            int rows = sc.nextInt();

            System.out.println("Here is ur star pattern : ");
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}