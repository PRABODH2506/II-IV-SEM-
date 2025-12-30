public class PN{
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // New line at the end
    }
    
  
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
