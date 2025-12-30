import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 9};

        System.out.println("Array: " + Arrays.toString(numbers));

        int min = numbers[0];               // assume first element is smallest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];           // update min if smaller element found
            }
        }

        System.out.println("Smallest number in array: " + min);
    }
}
