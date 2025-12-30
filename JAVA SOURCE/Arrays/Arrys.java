import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 9};

        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted array (ascending order): " + Arrays.toString(numbers));
    }
}
