public class evenOrOdd {
    
    public static String evenAndOdd (int num){

        if (num % 2 == 0) {
            return "even" ; 
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(evenAndOdd(5));
        System.out.println(evenAndOdd(10));
    }
}
