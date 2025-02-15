import java.util.Scanner;

public class switchAndString {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a name : ");
            String name = sc.nextLine();

            System.out.println("To uppercase : 1 , To lowercase : 2 , Find length : 3, To reverse : 4");
            int order = sc.nextInt();

            switch (order) {
                case 1:
                    String upperName = name.toUpperCase();
                    System.out.println(upperName);
                    break;
                case 2:
                    String lowerName = name.toLowerCase();
                    System.out.println(lowerName);
                    break;
                case 3:
                    System.out.println(name.length());
                    break;
                case 4:
                    String reversed = "";

                    for (int i = name.length() - 1; i >= 0; i--) {
                        reversed += name.charAt(i);
                    }
                    
                    System.out.println(reversed);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }
}
