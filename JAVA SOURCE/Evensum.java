import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        long n = sc.nextLong();

        long a = 0;      // F0
        long b = 1;      // F1
        long sum = 0;    // sum of even Fibonacci terms

        while (b <= n) {
            if (b % 2 == 0) {
                sum += b;
            }

            long next = a + b; // next Fibonacci term
            a = b;
            b = next;
        }

        System.out.println("Sum of even Fibonacci terms up to " + n + " = " + sum);
        sc.close();
    }
}
