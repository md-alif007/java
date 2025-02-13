// Write a Java program that takes 5 names as input from the user and stores them in a string array. Then, print the names in reverse order.

import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("How many names do you want to enter: ");
            int size = scanner.nextInt();
            scanner.nextLine();

            String[] arr = new String[size];

            System.out.println("Enter " + size + " names");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextLine();
            }

            System.out.print("\nthe names are: ");
            for (String string : arr) {
                System.out.print(string + " ");
            }

            System.out.print("\nthe reverse names are: \n");
            for (int i = size - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }

        }
    }
}
