// Take an array of 10 integers.
// Use a loop to search for a specific number in the array.
// If the number is found, print its index and break the loop immediately.
// If the number is not found, the loop should complete without interruption.

import java.util.Scanner;

public class arrayIndex {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of your array : ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements : ");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Your entered array is : ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.println("\nWhich number do you want to find: ");
            int query = sc.nextInt();

            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (query == arr[i]) {
                    System.out.println("Number " + query + " is found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Invalid Input");
            }
        }

    }
}
