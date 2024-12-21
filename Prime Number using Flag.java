import java.util.Scanner;

public class PrimeNumbersWithFlag {

    // Function to check if a number is prime using the flag method
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }

        // Set flag to true, assuming the number is prime
        boolean isPrimeFlag = true;

        // Check for factors from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // If divisible, it's not a prime number
                isPrimeFlag = false; // Set flag to false
                break; // No need to check further
            }
        }

        // Output factors of the number
        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " "); // Print all factors
            }
        }

        // If the flag is still true, it's prime
        if (isPrimeFlag) {
            System.out.println("(Prime number)");
        } else {
            System.out.println("(Not a prime number)");
        }

        return isPrimeFlag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the limit up to which we need to find primes
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        System.out.println("Checking numbers up to " + limit + ":");

        // Check each number up to the limit
        for (int i = 2; i <= limit; i++) {
            isPrime(i);
        }

        scanner.close();
    }
}