import java.util.Scanner;

public class vowelCount {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter a name to count the numbers of vowels: ");

            String name = scanner.nextLine();
            name = name.toLowerCase();
            System.out.println("Your entered name is : " + name);

            int cnt = 0;

            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    cnt++;
                }

            }
            System.out.println("The count of vowel is : " + cnt);
        }

    }
}
