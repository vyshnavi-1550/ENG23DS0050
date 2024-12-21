import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's prime: ");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        sc.close(); // Close the scanner
    }
    
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) return false; // Numbers <= 1 are not prime
        if (n <= 3) return true;  // 2 and 3 are prime numbers
        
        // Eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        // Check for factors up to the square root of n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        
        return true; // If no factors are found, n is prime
    }
}