// Write a Java program that takes 10 integers as input and stores them in an array. The program should then find and print the largest and smallest numbers from the array using an if-else condition.

import java.util.Scanner;

public class findNumArr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("How many numbers do you want in your array : ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements : ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("You Entered : ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

        }

    }

}
