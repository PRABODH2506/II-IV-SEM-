import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 9};

        System.out.println("Array: " + Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];    
            }
            if (numbers[i] < min) {
                min = numbers[i];      
            }
        }

        System.out.println("Maximum value in array: " + max);
        System.out.println("Minimum value in array: " + min);
    }
}
