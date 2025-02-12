import java.util.Scanner;

public class findWeek {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number to know the week : ");
            int i = sc.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Saturday");
                    break;
                case 2:
                    System.out.println("Sunday");
                    break;
                case 3:
                    System.out.println("Monday");
                    break;
                case 4:
                    System.out.println("Tueday");
                    break;
                case 5:
                    System.out.println("Wedday");
                    break;
                case 6:
                    System.out.println("Thursday");
                    break;
                case 7:
                    System.out.println("Friday");
                    break;

                default:
                    System.out.println("You have entered a unvalid number . Please enter number from 1 to 7");
            }
        }
    }
}