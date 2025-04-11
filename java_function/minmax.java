public class minmax {
    
    public static int findMin(int[] arr){
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num ;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        int[] numbers = {12, 14 , 15 , 16, 18, 20};

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minumum Number "  + min);
        System.out.println("Maximum Number "  + max);
    }

}
