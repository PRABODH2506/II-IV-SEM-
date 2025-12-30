import java.util.Scanner;

public class AMNO {

    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = 0;
        int temp = n;

        // count digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = n;

        // sum of digits^digits
        while (temp != 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
