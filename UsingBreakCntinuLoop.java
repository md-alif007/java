public class UsingBreakCntinuLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
